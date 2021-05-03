package utility

class PeraturanSuit() {
    fun aturanSuit(): String {
        println("1. Masukkan Pemain 1: ")
        val pemainPertama = readLine().toString()
        println("2.Masukkan Pemain 2: ")
        val pemainKedua = readLine().toString()
        return (if (pemainPertama == pemainKedua) {
            println("Hasil: SERI!")
        } else if (pemainPertama == "Batu" && pemainKedua == "Gunting") {
            println("Hasil: Pemain 1 MENANG!")
        } else if (pemainPertama == "Batu" && pemainKedua == "Kertas") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (pemainPertama == "Kertas" && pemainKedua == "Gunting") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (pemainPertama == "Kertas" && pemainKedua == "Batu") {
            println("Hasil: Pemain 1 MENANG!")
        } else if (pemainPertama == "Gunting" && pemainKedua == "Batu") {
            println("Hasil: Pemain 2 MENANG!")
        } else if (pemainPertama == "Gunting" && pemainKedua == "Kertas") {
            println("Hasil: Pemain 1 MENANG!")
        } else {
            println("WRONG INPUT!")
        }
                ).toString()

    }

}

