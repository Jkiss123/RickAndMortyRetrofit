package com.example.rickandmorthyretrofit

import com.squareup.moshi.Json

class Character(val name:String, val image:String) {
}

data class CharacterResponse(@Json(name="results")val results:List<Character>)