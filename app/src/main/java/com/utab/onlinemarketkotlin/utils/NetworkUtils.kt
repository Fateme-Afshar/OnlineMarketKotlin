package com.utab.onlinemarketkotlin.utils

class NetworkUtils {
    companion object{
        val BASE_URL="https://woocommerce.maktabsharif.ir/wp-json/wc/v3/"
        const val CONS_KEY="ck_373d2b7f68efab7ceba67788d017dfcc8e80cab6"
        const val CONS_SECRET="cs_45ceb9de983308785f5affc3b5648a48101b4b67"

        var MAP_KEYS=HashMap<String,String>().apply {
            this["consumer_key"]= CONS_KEY
            this["consumer_secret"]= CONS_SECRET
        }
    }
}