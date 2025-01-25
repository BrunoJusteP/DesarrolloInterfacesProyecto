package swing;

import swing.Cell;
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

        sun = new swing.Cell();
        mon = new swing.Cell();
        tue = new swing.Cell();
        wed = new swing.Cell();
        thu = new swing.Cell();
        fri = new swing.Cell();
        sat = new swing.Cell();
        cell8 = new swing.Cell();
        cell9 = new swing.Cell();
        cell10 = new swing.Cell();
        cell11 = new swing.Cell();
        cell12 = new swing.Cell();
        cell13 = new swing.Cell();
        cell14 = new swing.Cell();
        cell15 = new swing.Cell();
        cell16 = new swing.Cell();
        cell17 = new swing.Cell();
        cell18 = new swing.Cell();
        cell19 = new swing.Cell();
        cell20 = new swing.Cell();
        cell21 = new swing.Cell();
        cell22 = new swing.Cell();
        cell23 = new swing.Cell();
        cell24 = new swing.Cell();
        cell25 = new swing.Cell();
        cell26 = new swing.Cell();
        cell27 = new swing.Cell();
        cell28 = new swing.Cell();
        cell29 = new swing.Cell();
        cell30 = new swing.Cell();
        cell31 = new swing.Cell();
        cell32 = new swing.Cell();
        cell33 = new swing.Cell();
        cell34 = new swing.Cell();
        cell35 = new swing.Cell();
        cell36 = new swing.Cell();
        cell37 = new swing.Cell();
        cell38 = new swing.Cell();
        cell39 = new swing.Cell();
        cell40 = new swing.Cell();
        cell41 = new swing.Cell();
        cell42 = new swing.Cell();
        cell43 = new swing.Cell();
        cell44 = new swing.Cell();
        cell45 = new swing.Cell();
        cell46 = new swing.Cell();
        cell47 = new swing.Cell();
        cell48 = new swing.Cell();
        cell49 = new swing.Cell();

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
    private swing.Cell cell10;
    private swing.Cell cell11;
    private swing.Cell cell12;
    private swing.Cell cell13;
    private swing.Cell cell14;
    private swing.Cell cell15;
    private swing.Cell cell16;
    private swing.Cell cell17;
    private swing.Cell cell18;
    private swing.Cell cell19;
    private swing.Cell cell20;
    private swing.Cell cell21;
    private swing.Cell cell22;
    private swing.Cell cell23;
    private swing.Cell cell24;
    private swing.Cell cell25;
    private swing.Cell cell26;
    private swing.Cell cell27;
    private swing.Cell cell28;
    private swing.Cell cell29;
    private swing.Cell cell30;
    private swing.Cell cell31;
    private swing.Cell cell32;
    private swing.Cell cell33;
    private swing.Cell cell34;
    private swing.Cell cell35;
    private swing.Cell cell36;
    private swing.Cell cell37;
    private swing.Cell cell38;
    private swing.Cell cell39;
    private swing.Cell cell40;
    private swing.Cell cell41;
    private swing.Cell cell42;
    private swing.Cell cell43;
    private swing.Cell cell44;
    private swing.Cell cell45;
    private swing.Cell cell46;
    private swing.Cell cell47;
    private swing.Cell cell48;
    private swing.Cell cell49;
    private swing.Cell cell8;
    private swing.Cell cell9;
    private swing.Cell fri;
    private swing.Cell mon;
    private swing.Cell sat;
    private swing.Cell sun;
    private swing.Cell thu;
    private swing.Cell tue;
    private swing.Cell wed;
    // End of variables declaration//GEN-END:variables
}
