package com.ospavliuk.gtn;

import java.util.logging.Level;
import java.util.logging.Logger;

class Ticker {
    private String text;
    private Gui gs;

    Ticker(String text, Gui gs) {
        this.text = text;
        this.gs = gs;
        go();
    }

    private void go() {
        if (gs.infoString.getText().isEmpty())
            new Thread(() -> {
                final String total = "                                                        " + text;
                for (int i = 0; i < total.length(); i++) {
                    gs.infoString.setText(total.substring(i, total.length()));
                    int t = i < 56 ? 50 : 100;
                    try {
                        Thread.sleep(t);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ticker.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                gs.infoString.setText("");
            }).start();
    }
}
