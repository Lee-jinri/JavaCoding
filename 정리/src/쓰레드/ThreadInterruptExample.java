package 쓰레드;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// 인터페이스 구현
class TimerRunnable implements Runnable{
	private JLabel timerLabel; // 타이머 값이 출력된 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	// 쓰레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		int n=0; // 타이머 카운트 값
		while (true) { // 무한루프
			timerLabel.setText(Integer.toString(n)); // 타이머 값을 레이블에 출력
			n++;
			try {
				Thread.sleep(1000); // 1초동안 실행 쓰레드를 실행 대기 상태로 전환.
			}
			catch(InterruptedException e) {
				return;  // 예외가 발생하면 스레드 종료
			}
		}
	}
}

public class ThreadInterruptExample extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Thread th;
	
	public ThreadInterruptExample() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout()); // 레이아웃 설정(왼쪽에서부터 배치)
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
		
		// 타이머 쓰레드로 사용할 Runnable 객체 생성
		// 타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달한다.
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // 쓰레드 생성
		add(timerLabel);
		
		// 버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // 타이머 쓰레드 강제종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); // 버튼 비활성화
			}	
		});
		add(btn);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start(); // 쓰레드 동작시킴
	}
	public static void main(String[] args) {
		new ThreadInterruptExample();
	}
	
}
