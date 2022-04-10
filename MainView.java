import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class MainView {
    public JFrame view;

    public JButton btnProduct = new JButton("Manage Products");
    public JButton btnCustomer = new JButton("Manage Customers");
    public JButton btnOrder = new JButton("Manage Orders");

    public MainView() {



        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        view.setTitle("Store Management System | Main");
        // center the frame
        view.setLocationRelativeTo(null);
        // no resizing
        view.setSize(500, 400);
        // no moving
        view.setLocationRelativeTo(null);









        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(btnProduct);
        buttons.add(btnCustomer);
        buttons.add(btnOrder);

        view.getContentPane().add(buttons);

        btnOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OrderView or = new OrderView();
                or.run();
            }
        });

        btnProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ProductView pr = new ProductView();
                pr.run();
            }
        });

        btnCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CustomerView cs = new CustomerView();
                cs.run();
            }
        });
    }
}
