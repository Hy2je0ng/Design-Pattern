import command.*;
import drawer.*;

import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
	// 그림 그린 이력
	private MacroCommand history = new MacroCommand();
	// 그림 그리는 영역
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	// 제거 버튼
	private JButton clearButton = new JButton("clear");

	// 생성자
	public Main(String title) {
		super(title);

		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);

		Box buttonBox = new Box(BoxLayout.X_AXIS); // 수평 추가
		buttonBox.add(clearButton);

		Box mainBox = new Box(BoxLayout.Y_AXIS); // 수직 추가
		mainBox.add(buttonBox);
		mainBox.add(canvas);

		getContentPane().add(mainBox);

		pack();
		show();
	}

	// ActionListener용 (버튼 클릭시 호출되는 메소드)
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
		}
	}

	// MouseMotionListener용 (마우스 드래그시 호출되는 메소드)
	public void mouseMoved(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}

	// WindowListener용 (윈도우창 X 표시 누를 때 호출되는 메소드)
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}
}
