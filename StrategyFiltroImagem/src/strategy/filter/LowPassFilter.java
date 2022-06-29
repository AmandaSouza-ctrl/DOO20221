/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.filter;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;


/**
 *
 * @author amanda.souza
 */
public class LowPassFilter implements Filter {
    
    public static final float[] BLUR3x3 = {
        0.1f, 0.1f, 0.1f,    // low-pass filter kernel
        0.1f, 0.2f, 0.1f,
        0.1f, 0.1f, 0.1f
    };

    public BufferedImageOp apply(){
        float[] data = BLUR3x3;
        BufferedImageOp op = new ConvolveOp(new Kernel(3, 3, data),
                            ConvolveOp.EDGE_NO_OP,
                            null);

        return op;
    }
}
