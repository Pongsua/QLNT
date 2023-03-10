/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myhousektpm;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author anhta
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);//full screen

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        pnlTrangChuButton = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnlThongBaoButton = new javax.swing.JPanel();
        lblThongBao = new javax.swing.JLabel();
        pnlLienHeButton = new javax.swing.JPanel();
        lblLienHe = new javax.swing.JLabel();
        pnlTaiKhoanButton = new javax.swing.JPanel();
        lblTaiKhoan = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlDanhSachPhongButton = new javax.swing.JPanel();
        lblDanhSachPhong = new javax.swing.JLabel();
        pnlDanhSachKhachHangButton = new javax.swing.JPanel();
        lblDanhSachKhachHang = new javax.swing.JLabel();
        pnlDichVuButton = new javax.swing.JPanel();
        lblDichVu = new javax.swing.JLabel();
        pnlHoaDonButton = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnlDoanhThuButton = new javax.swing.JPanel();
        lblDoanhThu = new javax.swing.JLabel();
        pnlLichSuThuePhongButton = new javax.swing.JPanel();
        lblLichSuThuePhong = new javax.swing.JLabel();
        pnlCaiDatButton = new javax.swing.JPanel();
        lblCaiDat = new javax.swing.JLabel();
        pnlAbout = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblSlogan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblSlogan2 = new javax.swing.JTextArea();
        lblImgMain2 = new javax.swing.JLabel();
        lblImgMain = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBackground(new java.awt.Color(126, 94, 84));
        pnlHeader.setPreferredSize(new java.awt.Dimension(200, 85));
        pnlHeader.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(126, 94, 84));

        jPanel14.setBackground(new java.awt.Color(126, 94, 84));
        jPanel14.setLayout(new java.awt.GridLayout(1, 4));

        pnlTrangChuButton.setBackground(new java.awt.Color(126, 94, 84));

        lblTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setText("Trang ch???");

        javax.swing.GroupLayout pnlTrangChuButtonLayout = new javax.swing.GroupLayout(pnlTrangChuButton);
        pnlTrangChuButton.setLayout(pnlTrangChuButtonLayout);
        pnlTrangChuButtonLayout.setHorizontalGroup(
            pnlTrangChuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pnlTrangChuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTrangChuButtonLayout.createSequentialGroup()
                    .addGap(0, 34, Short.MAX_VALUE)
                    .addComponent(lblTrangChu)
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        pnlTrangChuButtonLayout.setVerticalGroup(
            pnlTrangChuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(pnlTrangChuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTrangChuButtonLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(lblTrangChu)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        jPanel14.add(pnlTrangChuButton);

        pnlThongBaoButton.setBackground(new java.awt.Color(126, 94, 84));

        lblThongBao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblThongBao.setForeground(new java.awt.Color(255, 255, 255));
        lblThongBao.setText("Th??ng b??o");

        javax.swing.GroupLayout pnlThongBaoButtonLayout = new javax.swing.GroupLayout(pnlThongBaoButton);
        pnlThongBaoButton.setLayout(pnlThongBaoButtonLayout);
        pnlThongBaoButtonLayout.setHorizontalGroup(
            pnlThongBaoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pnlThongBaoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlThongBaoButtonLayout.createSequentialGroup()
                    .addGap(0, 31, Short.MAX_VALUE)
                    .addComponent(lblThongBao)
                    .addGap(0, 32, Short.MAX_VALUE)))
        );
        pnlThongBaoButtonLayout.setVerticalGroup(
            pnlThongBaoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(pnlThongBaoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlThongBaoButtonLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(lblThongBao)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        jPanel14.add(pnlThongBaoButton);

        pnlLienHeButton.setBackground(new java.awt.Color(126, 94, 84));

        lblLienHe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLienHe.setForeground(new java.awt.Color(255, 255, 255));
        lblLienHe.setText("Li??n h???");

        javax.swing.GroupLayout pnlLienHeButtonLayout = new javax.swing.GroupLayout(pnlLienHeButton);
        pnlLienHeButton.setLayout(pnlLienHeButtonLayout);
        pnlLienHeButtonLayout.setHorizontalGroup(
            pnlLienHeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pnlLienHeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLienHeButtonLayout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(lblLienHe)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );
        pnlLienHeButtonLayout.setVerticalGroup(
            pnlLienHeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(pnlLienHeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLienHeButtonLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(lblLienHe)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        jPanel14.add(pnlLienHeButton);

        pnlTaiKhoanButton.setBackground(new java.awt.Color(126, 94, 84));

        lblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTaiKhoan.setText("T??i kho???n");

        javax.swing.GroupLayout pnlTaiKhoanButtonLayout = new javax.swing.GroupLayout(pnlTaiKhoanButton);
        pnlTaiKhoanButton.setLayout(pnlTaiKhoanButtonLayout);
        pnlTaiKhoanButtonLayout.setHorizontalGroup(
            pnlTaiKhoanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pnlTaiKhoanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTaiKhoanButtonLayout.createSequentialGroup()
                    .addGap(0, 34, Short.MAX_VALUE)
                    .addComponent(lblTaiKhoan)
                    .addGap(0, 35, Short.MAX_VALUE)))
        );
        pnlTaiKhoanButtonLayout.setVerticalGroup(
            pnlTaiKhoanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(pnlTaiKhoanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTaiKhoanButtonLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(lblTaiKhoan)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        jPanel14.add(pnlTaiKhoanButton);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 372, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlHeader.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel13.setBackground(new java.awt.Color(126, 94, 84));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGICON/150.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(lblLogo)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        pnlHeader.add(jPanel13, java.awt.BorderLayout.WEST);

        getContentPane().add(pnlHeader, java.awt.BorderLayout.NORTH);

        pnlMain.setPreferredSize(new java.awt.Dimension(723, 300));
        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlMenu.setBackground(new java.awt.Color(126, 94, 84));
        pnlMenu.setPreferredSize(new java.awt.Dimension(200, 402));

        lblDanhSachPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhSachPhong.setText("Danh s??ch ph??ng");
        lblDanhSachPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDanhSachPhongButtonLayout = new javax.swing.GroupLayout(pnlDanhSachPhongButton);
        pnlDanhSachPhongButton.setLayout(pnlDanhSachPhongButtonLayout);
        pnlDanhSachPhongButtonLayout.setHorizontalGroup(
            pnlDanhSachPhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlDanhSachPhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDanhSachPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlDanhSachPhongButtonLayout.setVerticalGroup(
            pnlDanhSachPhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlDanhSachPhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDanhSachPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lblDanhSachKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhSachKhachHang.setText("Danh s??ch kh??ch h??ng");
        lblDanhSachKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDanhSachKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhSachKhachHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDanhSachKhachHangButtonLayout = new javax.swing.GroupLayout(pnlDanhSachKhachHangButton);
        pnlDanhSachKhachHangButton.setLayout(pnlDanhSachKhachHangButtonLayout);
        pnlDanhSachKhachHangButtonLayout.setHorizontalGroup(
            pnlDanhSachKhachHangButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlDanhSachKhachHangButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDanhSachKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlDanhSachKhachHangButtonLayout.setVerticalGroup(
            pnlDanhSachKhachHangButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlDanhSachKhachHangButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lblDichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDichVu.setText("D???ch v???");
        lblDichVu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlDichVuButtonLayout = new javax.swing.GroupLayout(pnlDichVuButton);
        pnlDichVuButton.setLayout(pnlDichVuButtonLayout);
        pnlDichVuButtonLayout.setHorizontalGroup(
            pnlDichVuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlDichVuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDichVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlDichVuButtonLayout.setVerticalGroup(
            pnlDichVuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlDichVuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setText("Ho?? ????n");
        lblHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlHoaDonButtonLayout = new javax.swing.GroupLayout(pnlHoaDonButton);
        pnlHoaDonButton.setLayout(pnlHoaDonButtonLayout);
        pnlHoaDonButtonLayout.setHorizontalGroup(
            pnlHoaDonButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlHoaDonButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlHoaDonButtonLayout.setVerticalGroup(
            pnlHoaDonButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlHoaDonButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lblDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoanhThu.setText("Doanh thu");
        lblDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoanhThuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDoanhThuButtonLayout = new javax.swing.GroupLayout(pnlDoanhThuButton);
        pnlDoanhThuButton.setLayout(pnlDoanhThuButtonLayout);
        pnlDoanhThuButtonLayout.setHorizontalGroup(
            pnlDoanhThuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlDoanhThuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlDoanhThuButtonLayout.setVerticalGroup(
            pnlDoanhThuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlDoanhThuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lblLichSuThuePhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLichSuThuePhong.setText("L???ch s??? thu?? ph??ng");
        lblLichSuThuePhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlLichSuThuePhongButtonLayout = new javax.swing.GroupLayout(pnlLichSuThuePhongButton);
        pnlLichSuThuePhongButton.setLayout(pnlLichSuThuePhongButtonLayout);
        pnlLichSuThuePhongButtonLayout.setHorizontalGroup(
            pnlLichSuThuePhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlLichSuThuePhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblLichSuThuePhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlLichSuThuePhongButtonLayout.setVerticalGroup(
            pnlLichSuThuePhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlLichSuThuePhongButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblLichSuThuePhong, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lblCaiDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaiDat.setText("C??i ?????t");
        lblCaiDat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlCaiDatButtonLayout = new javax.swing.GroupLayout(pnlCaiDatButton);
        pnlCaiDatButton.setLayout(pnlCaiDatButtonLayout);
        pnlCaiDatButtonLayout.setHorizontalGroup(
            pnlCaiDatButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlCaiDatButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblCaiDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlCaiDatButtonLayout.setVerticalGroup(
            pnlCaiDatButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(pnlCaiDatButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCaiDatButtonLayout.createSequentialGroup()
                    .addContainerGap(12, Short.MAX_VALUE)
                    .addComponent(lblCaiDat)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDanhSachPhongButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDanhSachKhachHangButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDichVuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlHoaDonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDoanhThuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLichSuThuePhongButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCaiDatButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDanhSachPhongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDanhSachKhachHangButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDichVuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlHoaDonButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDoanhThuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLichSuThuePhongButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(pnlCaiDatButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMain.add(pnlMenu, java.awt.BorderLayout.WEST);

        pnlAbout.setBackground(new java.awt.Color(255, 252, 252));
        pnlAbout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlAbout.setLayout(new java.awt.BorderLayout());

        lblSlogan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSlogan.setText("\"Qu???n l?? nh?? tr??? c???a b???n trong t???m tay...\"");

        lblSlogan2.setColumns(20);
        lblSlogan2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSlogan2.setLineWrap(true);
        lblSlogan2.setRows(5);
        lblSlogan2.setText("M???i ?? ki???n c???a b???n ?????u gi??p ch??ng t??i ph??t tri???n t???t h??n, c???m ??n c??c b???n ???? ????ng g??p !");
        lblSlogan2.setWrapStyleWord(true);
        lblSlogan2.setAutoscrolls(false);
        lblSlogan2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblSlogan2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lblSlogan2.setEnabled(false);
        lblSlogan2.setFocusable(false);
        lblSlogan2.setName(""); // NOI18N
        jScrollPane1.setViewportView(lblSlogan2);

        lblImgMain2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGICON/pexels-bianca-1560065.png"))); // NOI18N

        lblImgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGICON/pexels-luis-quintero-2111757.jpg"))); // NOI18N

        btnTimKiem.setText("T??m ki???m");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSlogan)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblImgMain, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImgMain2))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblSlogan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addComponent(lblImgMain, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(lblImgMain2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlAbout.add(jPanel1, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlAbout, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoanhThuMouseClicked
        pnlAbout.removeAll();
        pnlAbout.add(new QLDoanhThu());
        pnlAbout.revalidate();
    }//GEN-LAST:event_lblDoanhThuMouseClicked

    private void lblDanhSachKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhSachKhachHangMouseClicked
        new khachhang(this, true).setVisible(true);
    }//GEN-LAST:event_lblDanhSachKhachHangMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaiDat;
    private javax.swing.JLabel lblDanhSachKhachHang;
    private javax.swing.JLabel lblDanhSachPhong;
    private javax.swing.JLabel lblDichVu;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblImgMain;
    private javax.swing.JLabel lblImgMain2;
    private javax.swing.JLabel lblLichSuThuePhong;
    private javax.swing.JLabel lblLienHe;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSlogan;
    private javax.swing.JTextArea lblSlogan2;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlCaiDatButton;
    private javax.swing.JPanel pnlDanhSachKhachHangButton;
    private javax.swing.JPanel pnlDanhSachPhongButton;
    private javax.swing.JPanel pnlDichVuButton;
    private javax.swing.JPanel pnlDoanhThuButton;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHoaDonButton;
    private javax.swing.JPanel pnlLichSuThuePhongButton;
    private javax.swing.JPanel pnlLienHeButton;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTaiKhoanButton;
    private javax.swing.JPanel pnlThongBaoButton;
    private javax.swing.JPanel pnlTrangChuButton;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
