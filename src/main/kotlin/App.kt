import utility.PeraturanSuit

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.headerSuit()
            app.runSuit()

        }
    }

    private fun headerSuit() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun runSuit() {
        PeraturanSuit().aturanSuit()
    }

    }





