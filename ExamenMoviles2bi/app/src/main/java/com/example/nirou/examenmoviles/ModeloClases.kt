package com.example.nirou.examenmoviles

import android.os.Parcel
import android.os.Parcelable



class Entrenador(
    var id:Int?,
    var nombres: String,
    var apellidos: String,
    var fechaNacimiento: String,
    var numeroMedallas: Int,
    var campeonActual: Int
){}


class Pokemon(
    var id:Int?,
    var numeroPokemon: Int,
    var nombrePokemon: String,
    var poderEspecialUno: String,
    var poderEspecialDos: String,
    var fechaCaptura: String,
    var nivel:Int,
    var entrenadorId: Int?
){}




// PARA SERIALIZAR ENTRE INTENTS
class EntrenadorSe (var id:Int?,
    var nombres: String,
    var apellidos: String,
    var fechaNacimiento: String,
    var numeroMedallas: Int,
    var campeonActual: Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as Int,
        parcel.readValue(Int::class.java.classLoader) as Int
        ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(nombres)
        parcel.writeString(apellidos)
        parcel.writeString(fechaNacimiento)
        parcel.writeInt(numeroMedallas)
        parcel.writeInt(campeonActual)

    }



    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EntrenadorSe> {
        override fun createFromParcel(parcel: Parcel): EntrenadorSe {
            return createFromParcel(parcel)
        }

        override fun newArray(size: Int): Array<EntrenadorSe?> {
            return arrayOfNulls(size)
        }
    }
}

class PokemonSe(
    var id:Int?,
    var numeroPokemon: Int,
    var nombrePokemon: String,
    var poderEspecialUno: String,
    var poderEspecialDos: String,
    var fechaCaptura: String,
    var nivel:Int,
    var entrenadorId: Int?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeInt(numeroPokemon)
        parcel.writeString(nombrePokemon)
        parcel.writeString(poderEspecialUno)
        parcel.writeString(poderEspecialDos)
        parcel.writeString(fechaCaptura)
        parcel.writeInt(nivel)
        parcel.readValue(Int::class.java.classLoader) as Int
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PokemonSe> {
        override fun createFromParcel(parcel: Parcel): PokemonSe {
            return PokemonSe(parcel)
        }

        override fun newArray(size: Int): Array<PokemonSe?> {
            return arrayOfNulls(size)
        }
    }
}