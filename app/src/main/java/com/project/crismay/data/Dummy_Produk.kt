package com.project.crismay.data

import com.project.crismay.R

object Dummy_Produk {

    private val iconNama = intArrayOf(
        R.drawable.gesper,
        R.drawable.daster,
        R.drawable.blazer,
        R.drawable.jam,
        R.drawable.kebaya
    )

    private val TextNama = arrayOf(
        "DMZK-1290",
        "Daster Remple Rayon - Mint",
        "Blazer Zara Blazer Kotak",
        "Jam tangan wanita Rolex",
        "Setelan Kebaya Brokat Kutubaru"
    )

    private val TextKategori = arrayOf(
        "Ikat Pinggang Wanita",
        "Daster Wanita",
        "Blazer Wanita",
        "Jam Tangan Wanita",
        "Setelan Kebaya"
    )

    private val TextDeskripsi = arrayOf(
        "Import 100%\n" +
                "Bahan: Tali\n" +
                "Panjang 100 cm\n" +
                "Lebar 3 cm\n" +
                "Ready Warna : Black, White, Orange\n" +
                "\n" +
                "Semua produk kita dilindungi oleh BUBBLE WRAP ( GRATIS), jadi sudah pasti aman dalam pengiriman ke tempat kalian :)\n" +
                "\n" +
                "Semua barang kami kualitasnya juga pasti terjamin karena selalu dicek dengan teliti pas packing , jadi kalian tidak bakal kecewa dengan barang kami.\n" +
                "\n" +
                "Videoin pas buka packingan biar bisa retur bila terjadi kekurangan atau kerusakan ( TANPA VIDEO NO RETUR )\n" +
                "\n" +
                "Welcome Reseller dan Dropshipper\n" +
                "Bagi yang dropship langsung cantumkan nama toko kalian pas check out :)\n" +
                "#ikatpinggang #ikatpinggangmurah #ikatpinggangcewek #sabukcewek #gespercewek #beltcewek #talipinggangcewek #ikatpinggangkulit #sabukkulit #ikatpinggangimport",
        "Daster Polos Ruffle / Daster remple Rayon\n" +
                "\n" +
                "Daster Remaja / mama muda yg kekinian\n" +
                "Cocok utk santai / harian dirumah\n" +
                "\n" +
                "Bahan Katun Rayon (Adem, lembut dan jatoh)\n" +
                "Tidak tebal juga tidak tipis\n" +
                "L. Dada = -+120cm\n" +
                "Panjang = -+100-105cm (dibawah dengkul / sebetis tergantung TB)\n" +
                "muat sampai BB 80kg\n" +
                "1kilo muat 5pcs\n" +
                "\n" +
                "#daster #dasterkekinian #dasterruffle #dasterrempel #dasterkatun #dasterpolos #dasteradem",
        "Mat: Cotton HQ\n" +
                "Detail Size\n" +
                "Allsize\n" +
                "Pj: 80cm\n" +
                "Ld: 100cm\n" +
                "Pj Lengan: 55cm\n" +
                "Lingkar Ketiak: 50cm\n" +
                "\n" +
                "Tersedia 2 Warna\n" +
                "Grey\n" +
                "Brown\n" +
                "\n" +
                "Tersedia Blazer polos juga\n" +
                "Pink\n" +
                "Grey\n" +
                "Black\n" +
                "Brown\n" +
                "\n" +
                "Tersedia Blazer Polos",
        "GENDER :Wanita\n" +
                "TALI : Stainless\n" +
                "KWALITAS : Super AAA\n" +
                "POWER : BATRAI\n" +
                "DIAMETER RATA RATA : 3,3 cm\n" +
                "FEATURE:Tanggal akti\n" +
                "Water resist (wudhu dan cipratan air)\n" +
                "INCLUDE:\n" +
                "-Free Box\n" +
                "-Free Batrai cadangan\n" +
                "-free Packing menggunakan bubble wrap\n" +
                "* selalu dilakukan 2x pengecekan produk sebelum pengiriman.\n" +
                "* packing aman & Rapi",
        "Setelan Kebaya Brukat Full Furing\n" +
                "Tangan Pajang 7/8\n" +
                "Rok Lilit Sudah Ada Ring Dan Lilitan Dr Sisi Kiri Dan Kanan Tinggal Lilit\n" +
                "SIZE M, L, XL, XXL\n" +
                "M : LD 88-92 cm\n" +
                "L : LD 94-96 cm\n" +
                "XL : LD 98-102 cm\n" +
                "XXL : LD 104-106 cm"
    )

    private val TextHarga = intArrayOf(
        34000,
        35000,
        110000,
        140000,
        147000
    )

    val listdata: ArrayList<Produk>
        get() {
            val list = arrayListOf<Produk>()
            for(position in TextNama.indices){
                val produk = Produk()
                produk.nama = TextNama[position]
                produk.icon = iconNama[position]
                produk.kategori = TextKategori[position]
                produk.deskripsi = TextDeskripsi[position]
                produk.harga = TextHarga[position]
                list.add(produk)
            }
            return list
        }

}