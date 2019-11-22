package com.company;
import java.awt.*;
import javax.swing.*;
public class InvoiceScreen {
    private JFrame frame = new JFrame();
    private JLabel lblCustomerName = new JLabel("Customer's name:");
    private JTextField txtCustomerName = new JTextField("Enter customer's name");

    private JLabel lblRoomCode = new JLabel("Room's code:");
    private JTextField txtRoomCode = new JTextField("Enter room's code:");

    private JLabel lblPrice = new JLabel("Price: ");
    private JTextField txtPrice = new JTextField("Enter price:");

    InvoiceScreen() {
        frame.setSize(480, 300);
        lblCustomerName.setBounds(20, 30, 120, 30);
        txtCustomerName.setBounds(140, 30, 170, 30);
        txtCustomerName.setBorder(BorderFactory.createCompoundBorder(
                txtCustomerName.getBorder(),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        frame.add(lblCustomerName);
        frame.add(txtCustomerName);

        lblCustomerName.setBounds(20, 30, 120, 30);
        txtCustomerName.setBounds(140, 30, 170, 30);
        txtCustomerName.setBorder(BorderFactory.createCompoundBorder(
                txtCustomerName.getBorder(),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        frame.add(lblCustomerName);
        frame.add(txtCustomerName);

        lblCustomerName.setBounds(20, 30, 120, 30);
        txtCustomerName.setBounds(140, 30, 170, 30);
        txtCustomerName.setBorder(BorderFactory.createCompoundBorder(
                txtCustomerName.getBorder(),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));
        frame.add(lblCustomerName);
        frame.add(txtCustomerName);

        frame.setLayout(null);
    }
    public void show() {
        this.frame.setVisible(true);
    }
}
