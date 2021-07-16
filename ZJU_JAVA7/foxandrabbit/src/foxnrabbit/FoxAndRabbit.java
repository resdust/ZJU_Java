package foxnrabbit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import animal.Fox;
import animal.Rabbit;
import cell.Cell;
import field.Field;
import field.Location;
import field.View;

/**
 * 閫昏緫瀹炵幇绫伙細瀹炵幇鏁版嵁涔嬮棿浜や簰閫昏緫锛屽疄鐜版父鎴忚鍒欏拰瑙勮寖锛�
 *      1.璁￢iew鏄剧ず鍘熷鏁版嵁
 *      2.鍦⊿tep()鍐呭疄鐜版墍鏈夋暟鎹殑鏇存柊锛堝湪娓告垙瑙勫垯涓嬶級
 *      3.鍐嶆鏄剧ず鏁版嵁锛屽惊鐜紝瀹炵幇鏁版嵁鐨勫鎬佹樉绀�
 */
public class FoxAndRabbit {
    private Field theField;
    private View theView;
    private JFrame frame;

    public FoxAndRabbit(int size) {
        theField = new Field(size, size);
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                double probability = Math.random();
                if (probability < 0.05) {
                    theField.place(row, col, new Fox());
                } else if (probability < 0.15) {
                    theField.place(row, col, new Rabbit());
                }
            }
        }
        theView = new View(theField);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(theView);
        JButton btnStep = new JButton("One Step");
        frame.add(btnStep, BorderLayout.NORTH);
        btnStep.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pressed!");
				step();
				frame.repaint();
			}
        	
        });
        frame.pack();
        frame.setVisible(true);
    }

    public void start(int steps) {
        for (int i = 0; i < steps; i++) {
            step();
            theView.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void step() {
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                Cell cell = theField.get(row, col);
                if (cell != null) {
                    animal.Animal animal = (animal.Animal) cell;
                    animal.grow();
                    if (animal.isAlive()) {
                        //	move
                        Location loc = animal.move(theField.getFreeNeighbour(row, col));
                        if (loc != null) {
                            theField.move(row, col, loc);
                        }
                        //	eat
						//  animal.eat(theField);
                        Cell[] neighbour = theField.getNeighbour(row, col);
                        ArrayList<animal.Animal> listRabbit = new ArrayList<animal.Animal>();
                        for (Cell an : neighbour) {
                            if (an instanceof Rabbit) {
                                listRabbit.add((Rabbit) an);
                            }
                        }
                        if (!listRabbit.isEmpty()) {
                            animal.Animal fed = animal.feed(listRabbit);
                            if (fed != null) {
                                theField.remove((Cell) fed);
                            }
                        }
                        //	breed
                        animal.Animal baby = animal.breed();
                        if (baby != null) {
                            theField.placeRandomAdj(row, col, (Cell) baby);
                        }
                    } else {
                        theField.remove(row, col);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        FoxAndRabbit fnr = new FoxAndRabbit(50);
//        fnr.start(100);
    }

}
