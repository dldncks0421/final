import javax.swing.*;
import java.awt.*;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
        setTitle("구구단 출력기"); 
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null);

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 결과 출력 영역
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
        for(int i=2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");
            
  	         	for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            } 
        });
    }
}
