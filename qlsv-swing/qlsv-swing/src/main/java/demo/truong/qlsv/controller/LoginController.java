package demo.truong.qlsv.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import demo.truong.qlsv.dao.UserDao;
import demo.truong.qlsv.entity.User;
import demo.truong.qlsv.view.LoginView;
import demo.truong.qlsv.view.StudentView;

public class LoginController {
    private UserDao userDao;
    private LoginView loginView;
    private StudentView studentView;
    
    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDao();
        view.addLoginListener(new LoginListener());
    }
    
    public void showLoginView() {
        loginView.setVisible(true);
    }
    
   
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if (userDao.checkUser(user)) {
              
                studentView = new StudentView();
                StudentController studentController = new StudentController(studentView);
                studentController.showStudentView();
                loginView.setVisible(false);
            } else {
                loginView.showMessage("username hoặc password không đúng.");
            }
        }
    }
}
