package skj.raf.server.controller;

import skj.raf.server.view.MainFrame;

public class RenderCtrl {

	private static MainFrame _mainFrame;
	
	public enum Status {
		ACTIVE ("Active"),
		STOPPED ("Stopped");
		
		private String _name;
		
		Status (String name) {
			_name = name;
		}
		
		@Override
		public String toString() {
			return _name;
		}
	}
	
	public static void drawMain() {
		_mainFrame = new MainFrame();
		_mainFrame.bootstrap();
	}
	
	public static void end() {
		ConnectionCtrl.stopServer();
		_mainFrame.close();
	}
	
	public static void updateIP(String ip) {
		_mainFrame.updateIP(ip);
	}
	
	public static void updatePort(int port) {
		_mainFrame.updatePort(port + "");
	}
	
	public static void updateStatus(Status status) {
		_mainFrame.updateStatus(status.toString());
	}
	
	public static void updateSessions(int sessions) {
		_mainFrame.updateSessions(sessions + "");
	}
	
}