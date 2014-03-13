/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl49.control;

import java.awt.CardLayout;
import java.awt.Component;
import pkl49.component.GlassPane;
import pkl49.view.FormUtama;
import pkl49.view.PanelInput;
import pkl49.view.PanelInputNKD;

/**
 *
 * @author Ken
 */
public class ControlMenu {

    public static void entryRT(FormUtama form){
        form.getPanelKuesioner().getBtnSimpan().setEnabled(false);
        form.getPanelKuesioner().getBtnSimpan().setText("Save");
        FormUtil.resetKuesioner(form.getPanelKuesioner());
        Controller.showPanel(form.getPanelKuesioner(), "Halaman1");
        form.getPanelKuesioner().getHalaman1().getListHalaman1().get(0).requestFocusInWindow();
        showPanel(form, form.getPanelKuesioner(), "KuesionerRT");
        form.getPanelKuesioner().getHalaman1().getListHalaman1().get(0).requestFocusInWindow();
    }
    public static void updateRT(FormUtama form){
        PanelInput p = new PanelInput();
        p.setKues(form.getPanelKuesioner());
        p.setFormUtama(form);
        GlassPane pane = new GlassPane();
        form.setGlassPane(pane);
        form.getGlassPane().setVisible(true);
        p.getTxtB1R1().requestFocusInWindow();
        form.getPanelKuesioner().getBtnSimpan().setEnabled(true);
        pane.showComponent(p);
    }
    public static void entryPodes(FormUtama form){
        Controller.resetPodes(form.getPanelKuesionerPodes());
        form.getPanelKuesionerPodes().getBtnSave().setEnabled(false);
        form.getPanelKuesionerPodes().getBtnSave().setText("Save");
        form.getPanelKuesionerPodes().getListBlok1().get(0).requestFocusInWindow();
        showPanel(form, form.getPanelKuesionerPodes(), "KuesionerPodes");
        form.getPanelKuesionerPodes().getListBlok1().get(0).requestFocusInWindow();
    }

    public static void updatePodes(FormUtama form){
        PanelInputNKD input = new PanelInputNKD();
        input.setFormUtama(form);
        input.setKues(form.getPanelKuesionerPodes());
        form.setGlassPane(input);
        form.getGlassPane().setVisible(true);
        input.getTxtB1R1().requestFocusInWindow();
    }
    public static void backToHome(FormUtama form){
        showPanelMenu(form, form.getMenu().getPanelTwoChoice(), "paneltwochoice");
        showPanel(form, form.getMenu(), "Menu");
    }
    private static void showPanel(FormUtama form, Component panel, String nama){
        if (panel.isVisible()){
            return;
        }
        ((CardLayout)form.getPanelInduk().getLayout()).show(form.getPanelInduk(), nama);
    }
    private static void showPanelMenu(FormUtama form, Component panel, String nama){
        if (panel.isVisible()){
            return;
        }
        ((CardLayout)form.getMenu().getPanelInduk().getLayout()).show(form.getMenu().getPanelInduk(), nama);
    }
}
