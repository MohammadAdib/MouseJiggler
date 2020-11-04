package mohammad.adib

import java.awt.MouseInfo
import java.awt.Robot
import java.util.*

object Main {

    private val robot = Robot()

    @JvmStatic
    fun main(args: Array<String>) {
        while (true) {
            jiggle()
            val delay = 10000L + Random().nextInt(20000)
            println("Waiting ${delay}ms\n")
            Thread.sleep(delay)
        }
    }

    private fun jiggle() {
        val mouseLocation = MouseInfo.getPointerInfo().location
        val dx = getRandomChange()
        val dy = getRandomChange()
        robot.mouseMove(mouseLocation.x + dx, mouseLocation.y + dy)
        println("Jiggled $dx, $dy")
    }

    private fun getRandomChange(): Int {
        return Random().nextInt(6) - 3
    }
}