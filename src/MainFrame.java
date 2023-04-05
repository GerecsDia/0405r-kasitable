import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    MainFrame() {

        initComponents();
    }

    private void initComponents() {

        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new GridLayout(1, 1));

        //1.JTable table = new JTable(5, 4);                              //1.
        //2.s most megírjuk azt a konstruktort, amibe már tudunk adatot is feltölteni:(2 dimenziós tömb = tömbön belül tömbök vannak):
        String [][] data = {{"1-1", "1-2", "1-3"},                        //2.
                            {"2-1", "2-2", "2-3"},                        //2.
                            {"3-1", "3-2", "3-3"}};                       //2.
        
        String [] columnNames = {"Első", "Második", "Harmadik"};          //2.

        JTable table = new JTable(data, columnNames);                     //2.
        JScrollPane jsp = new JScrollPane(table);                          //1.-2.
        this.add(jsp);                                                    //1.-2.

        
    }
    
}
