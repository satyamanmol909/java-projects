import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchGUI {

    private static int H = 0, M = 0, S = 0;
    private static boolean running = false;

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create label to display time
        JLabel timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Serif", Font.PLAIN, 40));
        frame.add(timeLabel);

        // Create buttons
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        // Timer to update the stopwatch every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    S++;
                    if (S >= 60) {
                        S = 0;
                        M++;
                    }
                    if (M >= 60) {
                        M = 0;
                        H++;
                    }

                    // Update the label with the formatted time
                    timeLabel.setText(String.format("%02d:%02d:%02d", H, M, S));
                }
            }
        });

        // Start button action
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = true;
                timer.start();
            }
        });

        // Stop button action
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = false;
            }
        });

        // Reset button action
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = false;
                H = 0;
                M = 0;
                S = 0;
                timeLabel.setText(String.format("%02d:%02d:%02d", H, M, S));
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
