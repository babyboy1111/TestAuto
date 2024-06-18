package demo.truong.qlsv;

import java.awt.EventQueue;

import demo.truong.qlsv.controller.LoginController;
import demo.truong.qlsv.view.LoginView;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                
                controller.showLoginView();
            }
        });
    }
}