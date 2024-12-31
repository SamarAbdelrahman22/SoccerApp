import javax.swing.*;

public class Photo {

    public void showPhoto() {

        ImageIcon image=new ImageIcon("PHOTO.jpg");




        JLabel jLabel=new JLabel();
        jLabel.setIcon(image);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setTitle("Result of match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.add(jLabel);

        frame.setIconImage(image.getImage());

    }
}