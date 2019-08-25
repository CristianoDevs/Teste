/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monte.testedebug.validar;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Mensagens {
    
    public String mensagemNormal(String campo){
        JOptionPane.showMessageDialog(null, campo);
        return null;
    }
    
    public String mensagemCampoVazio(String campo){
        JOptionPane.showMessageDialog(null, "Preencha o campo " + campo, "Campo vazio", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }
}
