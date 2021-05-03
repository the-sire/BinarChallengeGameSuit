package utility

class PeraturanSuit() {
    fun aturanSuit(): String {
        println("1. Masukkan Pemain 1 (Gunting/Batu/Kertas): ")
        val pemainPertama = readLine()?.toLowerCase()
        println("2.Masukkan Pemain 2 (Gunting/Batu/Kertas): ")
        val pemainKedua = readLine()?.toLowerCase()
        return (if (pemainPertama == pemainKedua) {
            println("Hasil: SERI!")
        } else if (pemainPertama == "batu" && pemainKedua == "gunting") {
            println("Hasil: Pemain 1 MENANG!")
        } else if (pemainPertama == "batu" && pemainKedua == "kertas") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (pemainPertama == "kertas" && pemainKedua == "gunting") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (pemainPertama == "kertas" && pemainKedua == "batu") {
            println("Hasil: Pemain 1 MENANG!")
        } else if (pemainPertama == "gunting" && pemainKedua == "batu") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (pemainPertama == "gunting" && pemainKedua == "kertas") {
            println("Hasil: Pemain 1 MENANG!")
        } else {
            println("WRONG INPUT!")
        }
                ).toString()

    }

}

