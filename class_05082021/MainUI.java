import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    public class MainUI extends JFrame implements ActionListener{
        JButton btn01 ,btn02, btn03;//สร้างปุ่ม
        MainUI(){
            this.setSize(700,400);
            this.setLayout(new FlowLayout());

            btn01 = new JButton("Yes");
            btn02 = new JButton("No");
            btn03 = new JButton("OK");

            btn01.setBackground(Color.GREEN);
            btn02.setBackground(Color.RED);
            btn03.setBackground(Color.BLUE);

            btn01.addActionListener(this);
            btn02.addActionListener(this);
            btn03.addActionListener(this);

            this.add(btn01);
            this.add(btn02);
            this.add(btn03);

            this.setVisible(true);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent obj){
            if(obj.getSource() == btn01)
            JOptionPane.showMessageDialog(this,"YES","sawasdee",0);
            else if(obj.getSource() == btn02)
            JOptionPane.showMessageDialog(this,"NOOO","sawasdee",0);
            else if(obj.getSource() == btn03)
            JOptionPane.showMessageDialog(this,"OKEY","sawasdee",0);
        }
    }

