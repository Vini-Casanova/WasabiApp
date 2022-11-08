/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netbiis.app;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.netbiis.models.Pagamento;
import com.netbiis.models.Produtos;

/**
 *
 * @author RENAN
 */
@SuppressWarnings("serial")
public class Pedido  extends javax.swing.JFrame implements InstanceControllers {

	static int idC = 0;
	
	public Pedido(int i) {
        initComponents();
        idC = i;
    }
	
    public Pedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WassabiAPP Pedidos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Item", "Nome", "Valor","Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID produto", "Nome", "valor","descrição"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Promocoes", "Entrada", "Temaki Especial", "Holls"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jList1MouseClicked(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel1.setText("Carrinho:");

        jButton1.setText("Fechar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Erro em finalizar pedido");
					e.printStackTrace();
				}
            }
        });

        jButton2.setText("Adicionar Produto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Erro em adicionar pedido");
					e.printStackTrace();
				}
            }
            
        });
        
        
        jButton3.setText("Remover Produto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton3ActionPerformed(evt);
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Erro em deletar pedido");
					e.printStackTrace();
				}
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addComponent(jButton2))
                .addGap(60, 60, 60))
        ;

        pack();
    }

    //Mudança de tela 
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_jList1MouseClicked
        int index = jList1.getAnchorSelectionIndex();
        refreshTable2(prodf.findAllCategoria(index+1));
    }

    //Botão Fechar App
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)throws SQLException {
    	new FinalPedido(pf.findPagamentoProdutos(idC),idC).setVisible(true);
    }
    
    //Adicionar Pedido
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	int index = jTable2.getSelectedRow();
        
        int idProd = (int) jTable2.getValueAt(index, 0);
        System.out.println(idC);
        
        pf.addPagamento(idProd, idC);
        refreshTable1(pf.findPagamento(idC));
        
    }
   
    //Remove Pedido
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)throws SQLException {   
    	int index = jTable1.getSelectedRow();
    	int idProd = (int) jTable1.getValueAt(index, 0);
    	pf.removePagamento(idProd);
    	refreshTable1(pf.findPagamento(idC));
    }   
    
    
	private void refreshTable2(List<Produtos> lista) throws SQLException{
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        for (Produtos elem : lista) {
            Object[] dados = {
                elem.getIdProduto(),
                elem.getNameProdudo(),
                elem.getPrecoProduto(),
                elem.getDiscProduto(),
                elem.getCategoria(),
                
               };
            model.addRow(dados);
        }
    }
    private void refreshTable1(List<Pagamento> lista) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Pagamento elem : lista) {
            Object[] dados = {
                elem.getIdPagamento(),
                elem.getProdutos().getNameProdudo(),
                elem.getProdutos().getPrecoProduto(),
                elem.getProdutos().getDiscProduto(),
               };
            model.addRow(dados);
        }
    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    
}
