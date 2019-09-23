
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainGUI extends javax.swing.JFrame {

    private int iCodCliente;
    private int iMatFunc;
    ArrayList<Cliente> ListaCliente;
    ArrayList<Gerente> ListaGerente;
    ArrayList<Vendedor> ListaVendedor;
    String intrfc;

    public void lerDadosClientes() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Cód.", "CPF", "Nome", "Sexo", "Idade", "E-mail", "Telefone"}, 0);

        for (int count = 0; count < ListaCliente.size(); count++) {
            Object row[] = new Object[]{
                ListaCliente.get(count).getCodCliente(),
                ListaCliente.get(count).getCpf(),
                ListaCliente.get(count).getNome(),
                ListaCliente.get(count).getSexo(),
                ListaCliente.get(count).getIdade(),
                ListaCliente.get(count).getEmail(),
                ListaCliente.get(count).getTelefone()};
            modelo.addRow(row);

        }
        tableClientes.setModel(modelo);
    }

    public void lerDadosFuncGer() {
        DefaultTableModel modelo1 = new DefaultTableModel(new Object[]{"Matrícula", "Nome", "Idade", "Departamento", "Salário","Telefone","E-mail"}, 0);

        for (int count = 0; count < ListaGerente.size(); count++) {
            Object row[] = new Object[]{
                ListaGerente.get(count).getMatricula(),
                ListaGerente.get(count).getNome(),
                ListaGerente.get(count).getIdade(),
                ListaGerente.get(count).getDepartamento(),
                ListaGerente.get(count).getSalario(),
                ListaGerente.get(count).getTelefone(),
                ListaGerente.get(count).getEmail()};
            
            modelo1.addRow(row);

        }
        tableFuncionariosGerentes.setModel(modelo1);
    }

    public void lerDadosFuncVend() {
        DefaultTableModel modelo1 = new DefaultTableModel(new Object[]{"Matrícula", "Nome", "Idade", "Departamento", "Salário","Telefone","E-mail"}, 0);

        for (int count = 0; count < ListaVendedor.size(); count++) {
            Object row[] = new Object[]{
                ListaVendedor.get(count).getMatricula(),
                ListaVendedor.get(count).getNome(),
                ListaVendedor.get(count).getIdade(),
                ListaVendedor.get(count).getDepartamento(),
                ListaVendedor.get(count).getSalario(),
                ListaVendedor.get(count).getTelefone(),
                ListaVendedor.get(count).getEmail()};
            modelo1.addRow(row);

        }
        tableFuncionariosVendedores.setModel(modelo1);
    }

    public void LimparForm() {
        flNomeCli.setText("");
        flCPFCli.setText("");
        flTelCli.setText("");
        flMailCli.setText("");
    }

    public void LimparFormFunc() {
        flNomeFunc.setText("");
        flCpfFunc.setText("");
        flTelFunc.setText("");
        flMailFunc.setText("");
        flDptFunc.setText("");
    }

    public final void ControlarInterface() {
        switch (intrfc) {
            case "Navegar":
                flNomeCli.setEnabled(false);
                flCPFCli.setEnabled(false);
                flTelCli.setEnabled(false);
                flMailCli.setEnabled(false);
                rdSexoM.setEnabled(false);
                rdSexoF.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnNovo.setEnabled(true);
                cbDia.setEnabled(false);
                cbMes.setEnabled(false);
                cbAno.setEnabled(false);
                break;

            case "Novo":
                flNomeCli.setEnabled(true);
                flCPFCli.setEnabled(true);
                flTelCli.setEnabled(true);
                flMailCli.setEnabled(true);
                rdSexoM.setEnabled(true);
                rdSexoF.setEnabled(true);
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnNovo.setEnabled(false);
                btnEditar.setEnabled(false);
                cbDia.setEnabled(true);
                cbMes.setEnabled(true);
                cbAno.setEnabled(true);
                break;

            case "Editar":
                flNomeCli.setEnabled(false);
                flCPFCli.setEnabled(false);
                flTelCli.setEnabled(true);
                flMailCli.setEnabled(true);
                rdSexoM.setEnabled(false);
                rdSexoF.setEnabled(false);
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnNovo.setEnabled(true);
                cbDia.setEnabled(false);
                cbMes.setEnabled(false);
                cbAno.setEnabled(false);
                break;

            case "Excluir":
                flNomeCli.setEnabled(false);
                flCPFCli.setEnabled(false);
                flTelCli.setEnabled(false);
                flMailCli.setEnabled(false);
                rdSexoM.setEnabled(false);
                rdSexoF.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnNovo.setEnabled(true);
                cbDia.setEnabled(false);
                cbMes.setEnabled(false);
                cbAno.setEnabled(false);
                break;

            case "Selecionado":
                flNomeCli.setEnabled(false);
                flCPFCli.setEnabled(false);
                flTelCli.setEnabled(false);
                flMailCli.setEnabled(false);
                rdSexoM.setEnabled(false);
                rdSexoF.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnNovo.setEnabled(true);
                cbDia.setEnabled(false);
                cbMes.setEnabled(false);
                cbAno.setEnabled(false);
                break;
        }
    }

    public final void ControlarInterfaceFunc() {
        switch (intrfc) {
            case "Navegar":
                flDptFunc.setEnabled(false);
                flNomeFunc.setEnabled(false);
                flCpfFunc.setEnabled(false);
                flTelFunc.setEnabled(false);
                flMailFunc.setEnabled(false);
                rdSexoMFunc.setEnabled(false);
                rdSexoFFunc.setEnabled(false);
                btnSalvarFunc.setEnabled(false);
                btnCancelarFunc.setEnabled(false);
                btnEditarFunc.setEnabled(false);
                btnExcluirFunc.setEnabled(false);
                btnNovoFunc.setEnabled(true);
                cbDiaFunc.setEnabled(false);
                cbMesFunc.setEnabled(false);
                cbAnoFunc.setEnabled(false);
                break;

            case "Novo":
                flDptFunc.setEnabled(true);
                flNomeFunc.setEnabled(true);
                flCpfFunc.setEnabled(true);
                flTelFunc.setEnabled(true);
                flMailFunc.setEnabled(true);
                rdSexoMFunc.setEnabled(true);
                rdSexoFFunc.setEnabled(true);
                btnSalvarFunc.setEnabled(true);
                btnCancelarFunc.setEnabled(true);
                btnEditarFunc.setEnabled(false);
                btnExcluirFunc.setEnabled(false);
                btnNovoFunc.setEnabled(false);
                btnEditarFunc.setEnabled(false);
                cbDiaFunc.setEnabled(true);
                cbMesFunc.setEnabled(true);
                cbAnoFunc.setEnabled(true);
                break;

            case "Editar":
                flDptFunc.setEnabled(true);
                flNomeFunc.setEnabled(false);
                flCpfFunc.setEnabled(false);
                flTelFunc.setEnabled(true);
                flMailFunc.setEnabled(true);
                rdSexoMFunc.setEnabled(false);
                rdSexoFFunc.setEnabled(false);
                btnSalvarFunc.setEnabled(true);
                btnCancelarFunc.setEnabled(true);
                btnEditarFunc.setEnabled(false);
                btnExcluirFunc.setEnabled(false);
                btnNovoFunc.setEnabled(true);
                cbDiaFunc.setEnabled(false);
                cbMesFunc.setEnabled(false);
                cbAnoFunc.setEnabled(false);
                break;

            case "Excluir":
                flDptFunc.setEnabled(false);
                flNomeFunc.setEnabled(false);
                flCpfFunc.setEnabled(false);
                flTelFunc.setEnabled(false);
                flMailFunc.setEnabled(false);
                rdSexoMFunc.setEnabled(false);
                rdSexoFFunc.setEnabled(false);
                btnSalvarFunc.setEnabled(false);
                btnCancelarFunc.setEnabled(false);
                btnEditarFunc.setEnabled(false);
                btnExcluirFunc.setEnabled(false);
                btnNovoFunc.setEnabled(true);
                cbDiaFunc.setEnabled(false);
                cbMesFunc.setEnabled(false);
                cbAnoFunc.setEnabled(false);
                break;

            case "Selecionado":
                flDptFunc.setEnabled(false);
                flNomeFunc.setEnabled(false);
                flCpfFunc.setEnabled(false);
                flTelFunc.setEnabled(false);
                flMailFunc.setEnabled(false);
                rdSexoMFunc.setEnabled(false);
                rdSexoFFunc.setEnabled(false);
                btnSalvarFunc.setEnabled(false);
                btnCancelarFunc.setEnabled(false);
                btnEditarFunc.setEnabled(true);
                btnExcluirFunc.setEnabled(true);
                btnNovoFunc.setEnabled(true);
                cbDiaFunc.setEnabled(false);
                cbMesFunc.setEnabled(false);
                cbAnoFunc.setEnabled(false);
                break;
        }
    }

    public void LoadCbsDataNasc() {
        GregorianCalendar atual = new GregorianCalendar();

        cbDia.removeAllItems();
        cbMes.removeAllItems();
        cbAno.removeAllItems();

        cbDia.addItem("Dia");
        cbMes.addItem("Mês");
        cbAno.addItem("Ano");

        for (int dia = 1; dia <= 31; dia++) {
            if (dia <= 9) {
                cbDia.addItem("0" + (Integer.toString(dia)));
            } else {
                cbDia.addItem(Integer.toString(dia));
            }
        }
        for (int mes = 1; mes <= 12; mes++) {
            if (mes <= 9) {
                cbMes.addItem("0" + (Integer.toString(mes)));
            } else {
                cbMes.addItem(Integer.toString(mes));
            }

        }

        for (int ano = atual.get(Calendar.YEAR); ano >= 1900; ano--) {
            cbAno.addItem(Integer.toString(ano));
        }

    }

    public void LoadCbsDataNascFunc() {
        GregorianCalendar atual = new GregorianCalendar();

        cbDiaFunc.removeAllItems();
        cbMesFunc.removeAllItems();
        cbAnoFunc.removeAllItems();

        cbDiaFunc.addItem("Dia");
        cbMesFunc.addItem("Mês");
        cbAnoFunc.addItem("Ano");

        for (int dia = 1; dia <= 31; dia++) {
            if (dia <= 9) {
                cbDiaFunc.addItem("0" + (Integer.toString(dia)));
            } else {
                cbDiaFunc.addItem(Integer.toString(dia));
            }
        }
        for (int mes = 1; mes <= 12; mes++) {
            if (mes <= 9) {
                cbMesFunc.addItem("0" + (Integer.toString(mes)));
            } else {
                cbMesFunc.addItem(Integer.toString(mes));
            }

        }

        for (int ano = atual.get(Calendar.YEAR); ano >= 1900; ano--) {
            cbAnoFunc.addItem(Integer.toString(ano));
        }

    }

    public void FieldValidate() {

        if (intrfc.equals("Novo")) {
            if ((flNomeCli.getText().equals("")) || (flCPFCli.getText().equals("")) || (flTelCli.getText().equals("")) || (flMailCli.getText().equals(""))) {
                btnSalvar.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
            }
        } else if (intrfc.equals("Editar")) {
            if ((flTelCli.getText().equals("")) || (flMailCli.getText().equals(""))) {
                btnSalvar.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void FieldValidateFunc() {

        if (intrfc.equals("Novo")) {
            if ((flNomeFunc.getText().equals("")) || (flCpfFunc.getText().equals("")) || (flTelFunc.getText().equals("")) || (flMailFunc.getText().equals(""))) {
                btnSalvarFunc.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
            }
        } else if (intrfc.equals("Editar")) {
            if ((flTelFunc.getText().equals("")) || (flMailFunc.getText().equals(""))) {
                btnSalvarFunc.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void DataValidate() {
        if ((cbDia.getSelectedIndex() == 0) || (cbMes.getSelectedIndex() == 0) || (cbAno.getSelectedIndex() == 0)) {
            dataVal.setText("Selecione todos os campos.");
            btnSalvar.setEnabled(false);
        } else {
            dataVal.setText("  ");
            btnSalvar.setEnabled(true);
        }

    }

    public void DataValidateFunc() {
        if ((cbDiaFunc.getSelectedIndex() == 0) || (cbMesFunc.getSelectedIndex() == 0) || (cbAnoFunc.getSelectedIndex() == 0)) {
            dataValFunc.setText("Selecione todos os campos.");
            btnSalvar.setEnabled(false);
        } else {
            dataValFunc.setText("  ");
            btnSalvar.setEnabled(true);
        }

    }

    public void CPFValidate() {

        try {
            long cpf = Integer.parseInt(flCPFCli.getText());
            cpfVal.setText("  ");
            btnSalvar.setEnabled(true);
        } catch (NumberFormatException e) {
            cpfVal.setText("CPF inválido.");
            btnSalvar.setEnabled(false);
        }

    }

    public void CPFValidateFunc() {

        try {
            long cpf = Integer.parseInt(flCpfFunc.getText());
            cpfValFunc.setText("  ");
            btnSalvarFunc.setEnabled(true);
        } catch (NumberFormatException e) {
            cpfValFunc.setText("CPF inválido.");
            btnSalvarFunc.setEnabled(false);
        }

    }

    public void TelValidate() {

        try {
            long tel = Integer.parseInt(flTelCli.getText());
            telVal.setText("  ");
            btnSalvar.setEnabled(true);
        } catch (NumberFormatException e) {
            telVal.setText("Telefone inválido.");
            btnSalvar.setEnabled(false);
        }
    }

    public void TelValidateFunc() {

        try {
            long tel = Integer.parseInt(flTelFunc.getText());
            telValFunc.setText("  ");
            btnSalvarFunc.setEnabled(true);
        } catch (NumberFormatException e) {
            telValFunc.setText("Telefone inválido.");
            btnSalvarFunc.setEnabled(false);
        }

    }

    public MainGUI() {
        iCodCliente = 10000;
        iMatFunc = 1000;
        ListaCliente = new ArrayList();
        ListaVendedor = new ArrayList();
        ListaGerente = new ArrayList();

        initComponents();
        intrfc = ("Navegar");
        ControlarInterface();
        ControlarInterfaceFunc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        Tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        formCadastro = new javax.swing.JPanel();
        lblNomeCli = new javax.swing.JLabel();
        lblDtCli = new javax.swing.JLabel();
        lblSexoCli = new javax.swing.JLabel();
        lblCpfCli = new javax.swing.JLabel();
        lblMailCli = new javax.swing.JLabel();
        lvlTelCli = new javax.swing.JLabel();
        flNomeCli = new javax.swing.JTextField();
        rdSexoM = new javax.swing.JRadioButton();
        rdSexoF = new javax.swing.JRadioButton();
        flCPFCli = new javax.swing.JTextField();
        flTelCli = new javax.swing.JTextField();
        flMailCli = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cpfVal = new javax.swing.JLabel();
        telVal = new javax.swing.JLabel();
        dataVal = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();
        btnSobre = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNovoFunc = new javax.swing.JButton();
        btnEditarFunc = new javax.swing.JButton();
        btnExcluirFunc = new javax.swing.JButton();
        btnSobreFunc = new javax.swing.JButton();
        formCadastro2 = new javax.swing.JPanel();
        lblNomeCli2 = new javax.swing.JLabel();
        lblDtCli2 = new javax.swing.JLabel();
        lblSexoCli2 = new javax.swing.JLabel();
        lblCpfCli2 = new javax.swing.JLabel();
        lblMailCli2 = new javax.swing.JLabel();
        lvlTelCli2 = new javax.swing.JLabel();
        flNomeFunc = new javax.swing.JTextField();
        rdSexoMFunc = new javax.swing.JRadioButton();
        rdSexoFFunc = new javax.swing.JRadioButton();
        flCpfFunc = new javax.swing.JTextField();
        flTelFunc = new javax.swing.JTextField();
        flMailFunc = new javax.swing.JTextField();
        btnSalvarFunc = new javax.swing.JButton();
        btnCancelarFunc = new javax.swing.JButton();
        cpfValFunc = new javax.swing.JLabel();
        telValFunc = new javax.swing.JLabel();
        dataValFunc = new javax.swing.JLabel();
        cbDiaFunc = new javax.swing.JComboBox<>();
        cbMesFunc = new javax.swing.JComboBox<>();
        cbAnoFunc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        flDptFunc = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFuncionariosVendedores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFuncionariosGerentes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "CPF", "Nome", "Sexo", "Idade", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);
        if (tableClientes.getColumnModel().getColumnCount() > 0) {
            tableClientes.getColumnModel().getColumn(0).setResizable(false);
            tableClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableClientes.getColumnModel().getColumn(1).setResizable(false);
            tableClientes.getColumnModel().getColumn(1).setHeaderValue("CPF");
            tableClientes.getColumnModel().getColumn(2).setResizable(false);
            tableClientes.getColumnModel().getColumn(3).setResizable(false);
            tableClientes.getColumnModel().getColumn(4).setResizable(false);
            tableClientes.getColumnModel().getColumn(5).setResizable(false);
            tableClientes.getColumnModel().getColumn(6).setResizable(false);
            tableClientes.getColumnModel().getColumn(6).setHeaderValue("Telefone");
        }

        formCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        lblNomeCli.setText("Nome:");

        lblDtCli.setText("Data de Nascimento:");

        lblSexoCli.setText("Sexo:");

        lblCpfCli.setText("CPF:");

        lblMailCli.setText("E-Mail:");

        lvlTelCli.setText("Telefone:");

        flNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flNomeCliActionPerformed(evt);
            }
        });

        grupoSexo.add(rdSexoM);
        rdSexoM.setText("Masculino");

        grupoSexo.add(rdSexoF);
        rdSexoF.setText("Feminino");
        rdSexoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSexoFActionPerformed(evt);
            }
        });

        flCPFCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                flCPFCliFocusLost(evt);
            }
        });
        flCPFCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                flCPFCliKeyTyped(evt);
            }
        });

        flTelCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                flTelCliKeyTyped(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSalvarFocusGained(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cpfVal.setForeground(java.awt.Color.red);
        cpfVal.setText(" ");

        telVal.setForeground(java.awt.Color.red);
        telVal.setText("  ");

        dataVal.setForeground(java.awt.Color.red);
        dataVal.setText("  ");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        cbDia.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbDiaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês" }));
        cbMes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbMesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano" }));
        cbAno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbAnoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout formCadastroLayout = new javax.swing.GroupLayout(formCadastro);
        formCadastro.setLayout(formCadastroLayout);
        formCadastroLayout.setHorizontalGroup(
            formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flNomeCli)
                    .addGroup(formCadastroLayout.createSequentialGroup()
                        .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formCadastroLayout.createSequentialGroup()
                                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCli)
                                    .addComponent(lvlTelCli)
                                    .addComponent(flTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(formCadastroLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(telVal)))
                                .addGap(26, 26, 26))
                            .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formCadastroLayout.createSequentialGroup()
                                    .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCpfCli)
                                        .addGroup(formCadastroLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(cpfVal)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(formCadastroLayout.createSequentialGroup()
                                    .addComponent(flCPFCli, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addGap(26, 26, 26))))
                        .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formCadastroLayout.createSequentialGroup()
                                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtCli)
                                    .addGroup(formCadastroLayout.createSequentialGroup()
                                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(126, 126, 126)
                                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formCadastroLayout.createSequentialGroup()
                                        .addComponent(lblSexoCli)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE))
                                    .addGroup(formCadastroLayout.createSequentialGroup()
                                        .addComponent(rdSexoM)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdSexoF)
                                        .addGap(0, 8, Short.MAX_VALUE))))
                            .addGroup(formCadastroLayout.createSequentialGroup()
                                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flMailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMailCli)
                                    .addGroup(formCadastroLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(dataVal)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formCadastroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))))
                .addContainerGap())
        );
        formCadastroLayout.setVerticalGroup(
            formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formCadastroLayout.createSequentialGroup()
                .addComponent(lblNomeCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formCadastroLayout.createSequentialGroup()
                        .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpfCli)
                            .addComponent(lblSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdSexoF)
                            .addComponent(rdSexoM)
                            .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDtCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formCadastroLayout.createSequentialGroup()
                        .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnCancelar))
                        .addContainerGap())
                    .addGroup(formCadastroLayout.createSequentialGroup()
                        .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formCadastroLayout.createSequentialGroup()
                                .addComponent(cpfVal)
                                .addGap(18, 18, 18)
                                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMailCli)
                                    .addComponent(lvlTelCli))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(flMailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telVal))
                            .addComponent(dataVal))
                        .addGap(31, 31, 31))))
        );

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(formCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSobre)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre)
                .addGap(5, 5, 5))
        );

        Tabs.addTab("Cliente", jPanel1);

        btnNovoFunc.setText("Novo");
        btnNovoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncActionPerformed(evt);
            }
        });

        btnEditarFunc.setText("Editar");
        btnEditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncActionPerformed(evt);
            }
        });

        btnExcluirFunc.setText("Excluir");
        btnExcluirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncActionPerformed(evt);
            }
        });

        btnSobreFunc.setText("Sobre");
        btnSobreFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreFuncActionPerformed(evt);
            }
        });

        formCadastro2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        lblNomeCli2.setText("Nome:");

        lblDtCli2.setText("Data de Nascimento:");

        lblSexoCli2.setText("Cargo:");

        lblCpfCli2.setText("CPF:");

        lblMailCli2.setText("E-Mail:");

        lvlTelCli2.setText("Telefone:");

        flNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flNomeFuncActionPerformed(evt);
            }
        });

        grupoSexo.add(rdSexoMFunc);
        rdSexoMFunc.setText("Vendedor");

        grupoSexo.add(rdSexoFFunc);
        rdSexoFFunc.setText("Gerente");
        rdSexoFFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSexoFFuncActionPerformed(evt);
            }
        });

        flCpfFunc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                flCpfFuncFocusLost(evt);
            }
        });
        flCpfFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flCpfFuncActionPerformed(evt);
            }
        });
        flCpfFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                flCpfFuncKeyTyped(evt);
            }
        });

        flTelFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                flTelFuncKeyTyped(evt);
            }
        });

        btnSalvarFunc.setText("Salvar");
        btnSalvarFunc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSalvarFuncFocusGained(evt);
            }
        });
        btnSalvarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncActionPerformed(evt);
            }
        });

        btnCancelarFunc.setText("Cancelar");
        btnCancelarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncActionPerformed(evt);
            }
        });

        cpfValFunc.setForeground(java.awt.Color.red);
        cpfValFunc.setText(" ");

        telValFunc.setForeground(java.awt.Color.red);
        telValFunc.setText("  ");

        dataValFunc.setForeground(java.awt.Color.red);
        dataValFunc.setText("  ");

        cbDiaFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        cbDiaFunc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbDiaFuncPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cbMesFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês" }));
        cbMesFunc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbMesFuncPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        cbAnoFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano" }));
        cbAnoFunc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbAnoFuncPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setText("Departamento");

        javax.swing.GroupLayout formCadastro2Layout = new javax.swing.GroupLayout(formCadastro2);
        formCadastro2.setLayout(formCadastro2Layout);
        formCadastro2Layout.setHorizontalGroup(
            formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formCadastro2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flNomeFunc)
                    .addGroup(formCadastro2Layout.createSequentialGroup()
                        .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCli2)
                            .addComponent(lvlTelCli2)
                            .addComponent(flTelFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpfCli2)
                            .addGroup(formCadastro2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telValFunc)
                                    .addComponent(cpfValFunc)))
                            .addComponent(flCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formCadastro2Layout.createSequentialGroup()
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtCli2)
                                    .addGroup(formCadastro2Layout.createSequentialGroup()
                                        .addComponent(cbDiaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbMesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbAnoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(126, 126, 126)
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formCadastro2Layout.createSequentialGroup()
                                        .addComponent(lblSexoCli2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(formCadastro2Layout.createSequentialGroup()
                                        .addComponent(rdSexoMFunc)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdSexoFFunc)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formCadastro2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvarFunc)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarFunc))
                            .addGroup(formCadastro2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(dataValFunc))
                            .addGroup(formCadastro2Layout.createSequentialGroup()
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMailCli2)
                                    .addComponent(flMailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(flDptFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        formCadastro2Layout.setVerticalGroup(
            formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formCadastro2Layout.createSequentialGroup()
                .addComponent(lblNomeCli2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formCadastro2Layout.createSequentialGroup()
                        .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpfCli2)
                            .addComponent(lblSexoCli2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdSexoFFunc)
                            .addComponent(rdSexoMFunc)
                            .addComponent(cbDiaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAnoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDtCli2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formCadastro2Layout.createSequentialGroup()
                        .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarFunc)
                            .addComponent(btnCancelarFunc))
                        .addContainerGap())
                    .addGroup(formCadastro2Layout.createSequentialGroup()
                        .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formCadastro2Layout.createSequentialGroup()
                                .addComponent(cpfValFunc)
                                .addGap(18, 18, 18)
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMailCli2)
                                    .addComponent(lvlTelCli2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formCadastro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(flMailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flTelFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flDptFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telValFunc))
                            .addComponent(dataValFunc))
                        .addGap(31, 31, 31))))
        );

        tableFuncionariosVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Idade", "Departamento", "Salário", "Telefone", "E-maill"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionariosVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuncionariosVendedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableFuncionariosVendedores);
        if (tableFuncionariosVendedores.getColumnModel().getColumnCount() > 0) {
            tableFuncionariosVendedores.getColumnModel().getColumn(0).setResizable(false);
            tableFuncionariosVendedores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableFuncionariosVendedores.getColumnModel().getColumn(1).setResizable(false);
            tableFuncionariosVendedores.getColumnModel().getColumn(2).setResizable(false);
            tableFuncionariosVendedores.getColumnModel().getColumn(3).setResizable(false);
            tableFuncionariosVendedores.getColumnModel().getColumn(4).setResizable(false);
            tableFuncionariosVendedores.getColumnModel().getColumn(5).setResizable(false);
            tableFuncionariosVendedores.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane1.addTab("Vendedores", jScrollPane2);

        tableFuncionariosGerentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Idade", "Departamento", "Salário", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionariosGerentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuncionariosGerentesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableFuncionariosGerentes);
        if (tableFuncionariosGerentes.getColumnModel().getColumnCount() > 0) {
            tableFuncionariosGerentes.getColumnModel().getColumn(0).setResizable(false);
            tableFuncionariosGerentes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableFuncionariosGerentes.getColumnModel().getColumn(1).setResizable(false);
            tableFuncionariosGerentes.getColumnModel().getColumn(2).setResizable(false);
            tableFuncionariosGerentes.getColumnModel().getColumn(3).setResizable(false);
            tableFuncionariosGerentes.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Gerentes", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formCadastro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSobreFunc)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnNovoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnExcluirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoFunc)
                    .addComponent(btnEditarFunc)
                    .addComponent(btnExcluirFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(formCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobreFunc)
                .addGap(5, 5, 5))
        );

        Tabs.addTab("Funcionário", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flNomeCliActionPerformed

    private void rdSexoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSexoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSexoFActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String sexo = "";
        if (rdSexoM.isSelected()) {
            sexo = "Masculino";
        } else if (rdSexoF.isSelected()) {
            sexo = "Feminino";
        } else {
            sexo = "Não informado";
        }
        if (intrfc.equals("Novo")) {
            Cliente C = new Cliente();
            C.setCodCliente("CL" + iCodCliente++);
            C.setCpf(flCPFCli.getText());
            C.setNome(flNomeCli.getText());
            C.setDtNasc(cbDia.getSelectedItem() + "/" + cbMes.getSelectedItem() + "/" + cbAno.getSelectedItem());
            C.setTelefone(flTelCli.getText());
            C.setEmail(flMailCli.getText());
            C.setSexo(sexo);
            ListaCliente.add(C);
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "El Cadastrero", JOptionPane.INFORMATION_MESSAGE);
        } else if (intrfc.equals("Editar")) {
            int idxArray = tableClientes.getSelectedRow();
            ListaCliente.get(idxArray).setTelefone(flTelCli.getText());
            ListaCliente.get(idxArray).setEmail(flMailCli.getText());
            JOptionPane.showMessageDialog(this, "Cadastro atualizado com sucesso!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
        }
        lerDadosClientes();
        intrfc = ("Navegar");
        ControlarInterface();

        LimparForm();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int idxArray = tableClientes.getSelectedRow();
        if (idxArray >= 0 && idxArray < ListaCliente.size()) {
            ListaCliente.remove(idxArray);
        }
        intrfc = ("Navegar");
        ControlarInterface();
        lerDadosClientes();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        intrfc = ("Navegar");
        ControlarInterface();
        LimparForm();
        dataVal.setText("  ");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        intrfc = ("Novo");
        ControlarInterface();
        LoadCbsDataNasc();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        int idxArray = tableClientes.getSelectedRow();
        if (idxArray >= 0 && idxArray < ListaCliente.size()) {
            intrfc = ("Selecionado");
            ControlarInterface();
        }
    }//GEN-LAST:event_tableClientesMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        intrfc = ("Editar");
        ControlarInterface();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void flCPFCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_flCPFCliFocusLost

    }//GEN-LAST:event_flCPFCliFocusLost

    private void flCPFCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flCPFCliKeyTyped
        CPFValidate();
    }//GEN-LAST:event_flCPFCliKeyTyped

    private void flTelCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flTelCliKeyTyped
        TelValidate();
    }//GEN-LAST:event_flTelCliKeyTyped

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        JOptionPane.showMessageDialog(this, "¿Qué pasa?\n \n Projeto proposto para\n o primeiro bimestre."
                + " \n \n Where did the brain go?\n \n El Cadastrero\n Versión: \n 1.Infinity.Beyond."
                + "\n \n Beta Release."
                + "", "El Cadastrero", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void cbAnoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbAnoPopupMenuWillBecomeInvisible
        DataValidate();
    }//GEN-LAST:event_cbAnoPopupMenuWillBecomeInvisible

    private void cbMesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbMesPopupMenuWillBecomeInvisible
        DataValidate();
    }//GEN-LAST:event_cbMesPopupMenuWillBecomeInvisible

    private void cbDiaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbDiaPopupMenuWillBecomeInvisible
        DataValidate();
    }//GEN-LAST:event_cbDiaPopupMenuWillBecomeInvisible

    private void btnSalvarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSalvarFocusGained
        DataValidate();
        FieldValidate();
    }//GEN-LAST:event_btnSalvarFocusGained

    private void btnNovoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncActionPerformed
        intrfc = ("Novo");
        ControlarInterfaceFunc();
        LoadCbsDataNascFunc();
    }//GEN-LAST:event_btnNovoFuncActionPerformed

    private void btnEditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncActionPerformed
        intrfc = ("Editar");
        ControlarInterfaceFunc();
    }//GEN-LAST:event_btnEditarFuncActionPerformed

    private void btnExcluirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncActionPerformed
        int idxArray = tableFuncionariosVendedores.getSelectedRow();
        int idxArrayG = tableFuncionariosGerentes.getSelectedRow();

        if (idxArray >= 0 && idxArray < ListaVendedor.size()) {
            ListaVendedor.remove(idxArray);
        }

        if (idxArrayG >= 0 && idxArrayG < ListaGerente.size()) {
            ListaGerente.remove(idxArrayG);
        }

        intrfc = ("Navegar");
        ControlarInterfaceFunc();
        lerDadosFuncVend();
        lerDadosFuncGer();
    }//GEN-LAST:event_btnExcluirFuncActionPerformed

    private void btnSobreFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreFuncActionPerformed
        JOptionPane.showMessageDialog(this, "¿Qué pasa?\n \n Projeto proposto para\n o primeiro bimestre."
                + " \n \n Where did the brain go?\n \n El Cadastrero\n Versión: \n 1.Infinity.Beyond."
                + "\n \n Beta Release."
                + "", "El Cadastrero", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSobreFuncActionPerformed

    private void flNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flNomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flNomeFuncActionPerformed

    private void rdSexoFFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSexoFFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSexoFFuncActionPerformed

    private void flCpfFuncFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_flCpfFuncFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_flCpfFuncFocusLost

    private void flCpfFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flCpfFuncKeyTyped
        CPFValidateFunc();
    }//GEN-LAST:event_flCpfFuncKeyTyped

    private void flTelFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flTelFuncKeyTyped
        TelValidateFunc();
    }//GEN-LAST:event_flTelFuncKeyTyped

    private void btnSalvarFuncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSalvarFuncFocusGained
        DataValidateFunc();
        FieldValidateFunc();
    }//GEN-LAST:event_btnSalvarFuncFocusGained

    private void btnSalvarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncActionPerformed

        if (rdSexoMFunc.isSelected()) {
            if (intrfc.equals("Novo")) {
                Vendedor V = new Vendedor();

                V.setMatricula("VEND" + iMatFunc++);
                V.setCpf(flCpfFunc.getText());
                V.setNome(flNomeFunc.getText());
                V.setDtNasc(cbDiaFunc.getSelectedItem() + "/" + cbMesFunc.getSelectedItem() + "/" + cbAnoFunc.getSelectedItem());
                V.setTelefone(flTelFunc.getText());
                V.setEmail(flMailFunc.getText());
                V.setDepartamento(flDptFunc.getText());
                ListaVendedor.add(V);

                JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!", "El Cadastrero", JOptionPane.INFORMATION_MESSAGE);
            } else if (intrfc.equals("Editar")) {
                int idxArray = tableFuncionariosVendedores.getSelectedRow();
                ListaVendedor.get(idxArray).setTelefone(flTelFunc.getText());
                ListaVendedor.get(idxArray).setEmail(flMailFunc.getText());
                JOptionPane.showMessageDialog(this, "Cadastro atualizado com sucesso!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
            }

        } else if (rdSexoFFunc.isSelected()) {
            if (intrfc.equals("Novo")) {
                Gerente G = new Gerente();

                G.setMatricula("GER" + iMatFunc++);
                G.setCpf(flCpfFunc.getText());
                G.setNome(flNomeFunc.getText());
                G.setDtNasc(cbDiaFunc.getSelectedItem() + "/" + cbMesFunc.getSelectedItem() + "/" + cbAnoFunc.getSelectedItem());
                G.setTelefone(flTelFunc.getText());
                G.setEmail(flMailFunc.getText());
                G.setDepartamento(flDptFunc.getText());
                ListaGerente.add(G);

                JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!", "El Cadastrero", JOptionPane.INFORMATION_MESSAGE);
            } else if (intrfc.equals("Editar")) {
                int idxArrayG = tableFuncionariosGerentes.getSelectedRow();
                ListaGerente.get(idxArrayG).setTelefone(flTelFunc.getText());
                ListaGerente.get(idxArrayG).setEmail(flMailFunc.getText());
                JOptionPane.showMessageDialog(this, "Cadastro atualizado com sucesso!", "El Cadastrero", JOptionPane.WARNING_MESSAGE);
            }

        }

        lerDadosFuncVend();
        lerDadosFuncGer();
        intrfc = ("Navegar");
        ControlarInterfaceFunc();
        LimparFormFunc();
    }//GEN-LAST:event_btnSalvarFuncActionPerformed

    private void btnCancelarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncActionPerformed
        intrfc = ("Navegar");
        ControlarInterfaceFunc();
        LimparFormFunc();
        dataValFunc.setText("  ");
    }//GEN-LAST:event_btnCancelarFuncActionPerformed

    private void cbDiaFuncPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbDiaFuncPopupMenuWillBecomeInvisible
        DataValidateFunc();
    }//GEN-LAST:event_cbDiaFuncPopupMenuWillBecomeInvisible

    private void cbMesFuncPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbMesFuncPopupMenuWillBecomeInvisible
        DataValidateFunc();
    }//GEN-LAST:event_cbMesFuncPopupMenuWillBecomeInvisible

    private void cbAnoFuncPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbAnoFuncPopupMenuWillBecomeInvisible
        DataValidateFunc();
    }//GEN-LAST:event_cbAnoFuncPopupMenuWillBecomeInvisible

    private void flCpfFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flCpfFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flCpfFuncActionPerformed

    private void tableFuncionariosVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuncionariosVendedoresMouseClicked
        int idxArray = tableFuncionariosVendedores.getSelectedRow();
        if (idxArray >= 0 && idxArray < ListaVendedor.size()) {
            intrfc = ("Selecionado");
            ControlarInterfaceFunc();
        }
    }//GEN-LAST:event_tableFuncionariosVendedoresMouseClicked

    private void tableFuncionariosGerentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuncionariosGerentesMouseClicked
        int idxArrayG = tableFuncionariosGerentes.getSelectedRow();
        if (idxArrayG >= 0 && idxArrayG < ListaGerente.size()) {
            intrfc = ("Selecionado");
            ControlarInterfaceFunc();
        }
    }//GEN-LAST:event_tableFuncionariosGerentesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelarFunc;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarFunc;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirFunc;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovoFunc;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JButton btnSalvarFunc;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnSobreFunc;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbAnoFunc;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbDiaFunc;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbMesFunc;
    private javax.swing.JLabel cpfVal;
    private javax.swing.JLabel cpfValFunc;
    private javax.swing.JLabel dataVal;
    private javax.swing.JLabel dataValFunc;
    private javax.swing.JTextField flCPFCli;
    private javax.swing.JTextField flCPFCli1;
    private javax.swing.JTextField flCpfFunc;
    private javax.swing.JTextField flDptFunc;
    private javax.swing.JTextField flDtCli1;
    private javax.swing.JTextField flMailCli;
    private javax.swing.JTextField flMailCli1;
    private javax.swing.JTextField flMailFunc;
    private javax.swing.JTextField flNomeCli;
    private javax.swing.JTextField flNomeCli1;
    private javax.swing.JTextField flNomeFunc;
    private javax.swing.JTextField flTelCli;
    private javax.swing.JTextField flTelCli1;
    private javax.swing.JTextField flTelFunc;
    private javax.swing.JPanel formCadastro;
    private javax.swing.JPanel formCadastro1;
    private javax.swing.JPanel formCadastro2;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCpfCli;
    private javax.swing.JLabel lblCpfCli1;
    private javax.swing.JLabel lblCpfCli2;
    private javax.swing.JLabel lblDtCli;
    private javax.swing.JLabel lblDtCli1;
    private javax.swing.JLabel lblDtCli2;
    private javax.swing.JLabel lblMailCli;
    private javax.swing.JLabel lblMailCli1;
    private javax.swing.JLabel lblMailCli2;
    private javax.swing.JLabel lblNomeCli;
    private javax.swing.JLabel lblNomeCli1;
    private javax.swing.JLabel lblNomeCli2;
    private javax.swing.JLabel lblSexoCli;
    private javax.swing.JLabel lblSexoCli1;
    private javax.swing.JLabel lblSexoCli2;
    private javax.swing.JLabel lvlTelCli;
    private javax.swing.JLabel lvlTelCli1;
    private javax.swing.JLabel lvlTelCli2;
    private javax.swing.JRadioButton rdSexoF;
    private javax.swing.JRadioButton rdSexoF1;
    private javax.swing.JRadioButton rdSexoFFunc;
    private javax.swing.JRadioButton rdSexoM;
    private javax.swing.JRadioButton rdSexoM1;
    private javax.swing.JRadioButton rdSexoMFunc;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableFuncionariosGerentes;
    private javax.swing.JTable tableFuncionariosVendedores;
    private javax.swing.JLabel telVal;
    private javax.swing.JLabel telValFunc;
    // End of variables declaration//GEN-END:variables
}
