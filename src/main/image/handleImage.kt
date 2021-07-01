package main.image

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    //
    var image = BufferedImage(100,100,BufferedImage.TYPE_3BYTE_BGR)
    var h = 0..99 // height
    var w = 0..99 // width

    image.apply {
        for (i in w) {
            for (j in h){
                setRGB(i,j,0xff0000)
            }
        }
    }

    ImageIO.write(image,"bmp",File("a.bmp"))
}