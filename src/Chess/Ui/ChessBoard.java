package Chess.Ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class ChessBoard extends JPanel {
	public void initui() {
		// 创建面板
		JFrame jf = new JFrame();
		// 设置面板属性
		jf.setSize(1240, 860);
		jf.setTitle("中国象棋");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 设置关闭窗体即清除进程
		jf.getContentPane().setBackground(Color.WHITE);// 设置背景颜色为白色
		jf.setLocationRelativeTo(null);// 窗口
		jf.setResizable(false);// 设置窗体不可放缩
		this.setBackground(Color.white);
		jf.add(this);
		jf.setVisible(true);
	}
	
	// 重绘
	public void paint(Graphics g) {
		super.paint(g);
		// 画棋盘
		g.drawImage(new ImageIcon(getClass().getResource("../image/"+"chessboard.jpg")).getImage(), 90, 60, 625, 700, this);
	}
}
