package vista;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;

public class PanelDate extends javax.swing.JLayeredPane {

    private int month;
    private int year;

    public PanelDate(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }

    private void init() {
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        setDate();
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //  up 1 day
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new vista.Cell();
        mon = new vista.Cell();
        tue = new vista.Cell();
        wed = new vista.Cell();
        thu = new vista.Cell();
        fri = new vista.Cell();
        sat = new vista.Cell();
        cell8 = new vista.Cell();
        cell9 = new vista.Cell();
        cell10 = new vista.Cell();
        cell11 = new vista.Cell();
        cell12 = new vista.Cell();
        cell13 = new vista.Cell();
        cell14 = new vista.Cell();
        cell15 = new vista.Cell();
        cell16 = new vista.Cell();
        cell17 = new vista.Cell();
        cell18 = new vista.Cell();
        cell19 = new vista.Cell();
        cell20 = new vista.Cell();
        cell21 = new vista.Cell();
        cell22 = new vista.Cell();
        cell23 = new vista.Cell();
        cell24 = new vista.Cell();
        cell25 = new vista.Cell();
        cell26 = new vista.Cell();
        cell27 = new vista.Cell();
        cell28 = new vista.Cell();
        cell29 = new vista.Cell();
        cell30 = new vista.Cell();
        cell31 = new vista.Cell();
        cell32 = new vista.Cell();
        cell33 = new vista.Cell();
        cell34 = new vista.Cell();
        cell35 = new vista.Cell();
        cell36 = new vista.Cell();
        cell37 = new vista.Cell();
        cell38 = new vista.Cell();
        cell39 = new vista.Cell();
        cell40 = new vista.Cell();
        cell41 = new vista.Cell();
        cell42 = new vista.Cell();
        cell43 = new vista.Cell();
        cell44 = new vista.Cell();
        cell45 = new vista.Cell();
        cell46 = new vista.Cell();
        cell47 = new vista.Cell();
        cell48 = new vista.Cell();
        cell49 = new vista.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setText("D");
        sun.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });
        add(sun);

        mon.setText("L");
        mon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(mon);

        tue.setText("M");
        tue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(tue);

        wed.setText("X");
        wed.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(wed);

        thu.setText("J");
        thu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(thu);

        fri.setText("V");
        fri.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        fri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friActionPerformed(evt);
            }
        });
        add(fri);

        sat.setText("S");
        sat.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(sat);

        cell8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void friActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.Cell cell10;
    private vista.Cell cell11;
    private vista.Cell cell12;
    private vista.Cell cell13;
    private vista.Cell cell14;
    private vista.Cell cell15;
    private vista.Cell cell16;
    private vista.Cell cell17;
    private vista.Cell cell18;
    private vista.Cell cell19;
    private vista.Cell cell20;
    private vista.Cell cell21;
    private vista.Cell cell22;
    private vista.Cell cell23;
    private vista.Cell cell24;
    private vista.Cell cell25;
    private vista.Cell cell26;
    private vista.Cell cell27;
    private vista.Cell cell28;
    private vista.Cell cell29;
    private vista.Cell cell30;
    private vista.Cell cell31;
    private vista.Cell cell32;
    private vista.Cell cell33;
    private vista.Cell cell34;
    private vista.Cell cell35;
    private vista.Cell cell36;
    private vista.Cell cell37;
    private vista.Cell cell38;
    private vista.Cell cell39;
    private vista.Cell cell40;
    private vista.Cell cell41;
    private vista.Cell cell42;
    private vista.Cell cell43;
    private vista.Cell cell44;
    private vista.Cell cell45;
    private vista.Cell cell46;
    private vista.Cell cell47;
    private vista.Cell cell48;
    private vista.Cell cell49;
    private vista.Cell cell8;
    private vista.Cell cell9;
    private vista.Cell fri;
    private vista.Cell mon;
    private vista.Cell sat;
    private vista.Cell sun;
    private vista.Cell thu;
    private vista.Cell tue;
    private vista.Cell wed;
    // End of variables declaration//GEN-END:variables
}
