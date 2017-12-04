/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voos;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import tp.Aeroporto;
import tp.DescricaoAviao;
import tp.DescricaoVoo;
import tp.FaltaObjetosException;

/**
 *
 * @author Dener
 */
public class DescricaoDeVoos extends javax.swing.JInternalFrame {

    /**
     * Creates new form DescricaoDeVoo
     */
    public DescricaoDeVoos() {
        initComponents();
        this.criarOuEditar = true;   
        this.dcbm_aviao = new DefaultComboBoxModel();
        this.dcbm_origem = new DefaultComboBoxModel();
        this.dcbm_destino = new DefaultComboBoxModel();
        
        this.aviao.setModel(dcbm_aviao);
        this.origem.setModel(dcbm_origem);
        this.destino.setModel(dcbm_destino);
        
        adicionaComboBOX();
    }
    
    public DescricaoDeVoos(int idEditar) {
        initComponents();
        this.id = idEditar;
        this.criarOuEditar = false;
        this.dcbm_aviao = new DefaultComboBoxModel();
        this.dcbm_origem = new DefaultComboBoxModel();
        this.dcbm_destino = new DefaultComboBoxModel();
        
        this.aviao.setModel(dcbm_aviao);
        this.origem.setModel(dcbm_origem);
        this.destino.setModel(dcbm_destino);
        
        
        adicionaComboBOX();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        partida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chegada = new javax.swing.JTextField();
        confirma = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        origem = new javax.swing.JComboBox<>();
        destino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aviao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setTitle("Descricao de voo");

        jLabel1.setText("Horário de partida:");

        partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidaActionPerformed(evt);
            }
        });

        jLabel2.setText("Horário de chegada:");

        chegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chegadaActionPerformed(evt);
            }
        });

        confirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        cancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        origem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        origem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                origemItemStateChanged(evt);
            }
        });
        origem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                origemFocusGained(evt);
            }
        });

        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinoItemStateChanged(evt);
            }
        });
        destino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                destinoFocusGained(evt);
            }
        });

        jLabel4.setText("Selecionar aeroportos:");

        jLabel5.setText("Partida:");

        jLabel6.setText("Destino:");

        aviao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        aviao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aviaoItemStateChanged(evt);
            }
        });

        jLabel7.setText("Aviao:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(chegada)
                            .addComponent(partida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancela)
                        .addGap(18, 18, 18)
                        .addComponent(confirma)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(partida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(aviao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirma)
                    .addComponent(cancela))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partidaActionPerformed

    private void chegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chegadaActionPerformed

    private void aviaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aviaoItemStateChanged
        // TODO add your handling code here:
        
        //adicionaComboBOX();
        
    }//GEN-LAST:event_aviaoItemStateChanged

    private void origemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_origemItemStateChanged
                
    }//GEN-LAST:event_origemItemStateChanged

    private void destinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinoItemStateChanged
        
        
    }//GEN-LAST:event_destinoItemStateChanged

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        
        if(criarOuEditar) {
            criaDescricaoVoo();
        } else {
            editaDescricaoVoo();
        }
        
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Voos.listaAtualizada();
        Voos.atualizaLista();
        
    }//GEN-LAST:event_confirmaActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cancelaActionPerformed

    private void origemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_origemFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_origemFocusGained

    private void destinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_destinoFocusGained
       
    }//GEN-LAST:event_destinoFocusGained

    public void setDados(DescricaoVoo dv) {
        
        adicionaComboBOX();
        
        this.partida.setText( dv.getPartida() );
        this.chegada.setText( dv.getChegada() );
        //this.numero.setText( dv.get );
        this.aviao.setSelectedItem( String.valueOf( dv.getDv().getId() ));
        this.origem.setSelectedItem( dv.getOrigem().getId() );
        this.destino.setSelectedItem( dv.getDestino().getId() );
        
    }
    
    
    private void adicionaComboBOX() {
        
        if(Aeroporto.lista_aeroporto.size() < 2 || DescricaoAviao.lista_descricaoAviao.isEmpty()){
            this.confirma.setEnabled(false);
            this.id = -1;
        } else {
            this.confirma.setEnabled(true);
        }
        
        this.dcbm_origem.removeAllElements();
        this.dcbm_destino.removeAllElements();
        this.dcbm_aviao.removeAllElements();
        
        Aeroporto.lista_aeroporto.keySet().forEach((key) -> {
            //Capturamos o valor a partir da chave
            this.dcbm_origem.addElement(key);
            this.dcbm_destino.addElement(key);
            
        });
        
        DescricaoAviao.lista_descricaoAviao.keySet().forEach((k) -> {
            this.dcbm_aviao.addElement( String.valueOf( k ) );
        });
        
    }
    
    private void editaDescricaoVoo() {
        try {           
            DescricaoVoo.editaDescricaoVoo(this.id,
                partida.getText(),
                chegada.getText(),
                origem.getItemAt( origem.getSelectedIndex() ),
                destino.getItemAt( destino.getSelectedIndex() ),
                Integer.parseInt( aviao.getItemAt( aviao.getSelectedIndex() ) ));
        } catch (IOException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FaltaObjetosException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void criaDescricaoVoo() {
        try {           
            this.id = DescricaoVoo.criaDescricaoVoo(
                    partida.getText(),
                    chegada.getText(),
                    origem.getItemAt( origem.getSelectedIndex() ),
                    destino.getItemAt( destino.getSelectedIndex() ),
                    Integer.parseInt( aviao.getItemAt( aviao.getSelectedIndex() ) ));
        } catch (IOException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FaltaObjetosException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(DescricaoDeVoos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getID() {
        return this.id;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aviao;
    private javax.swing.JButton cancela;
    private javax.swing.JTextField chegada;
    private javax.swing.JButton confirma;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> origem;
    private javax.swing.JTextField partida;
    // End of variables declaration//GEN-END:variables
    public int id;
    private boolean criarOuEditar;
    private DefaultComboBoxModel dcbm_aviao;
    private DefaultComboBoxModel dcbm_origem;
    private DefaultComboBoxModel dcbm_destino;
    
}