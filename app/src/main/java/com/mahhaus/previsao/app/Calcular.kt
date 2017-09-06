package com.mahhaus.previsao.app

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.gson.Gson
import com.mahhaus.previsao.R
import com.mahhaus.previsao.domain.City
import com.mahhaus.previsao.domain.MhActivity
import io.realm.Realm
import java.io.*
import android.os.Environment.getExternalStorageDirectory



/**
 * Created by josias on 04/09/17 - 13:53.
 *
 */
class Calcular : MhActivity() {
    private var TAG : String? =  this::class.java.simpleName
    private var mEditeTextNome: EditText? = null
    private var mEditeTextSobreNome: EditText? = null
    private var mEditeTextIdade: EditText? = null
    private var mButtonEnviar: Button? = null

    private var mRealm: Realm? = null
    private var mCities: String? = ""
    private var mListCities: ArrayList<City> = arrayListOf()

    override fun mapearComponentes() {
        mEditeTextNome = findViewById(R.id.edt_nome)
        mEditeTextSobreNome = findViewById(R.id.edt_sobrenome)
        mEditeTextIdade = findViewById(R.id.edt_idade)
        mButtonEnviar = findViewById(R.id.btn_enviar)
    }

    override fun acoesComponentes() {
        mButtonEnviar?.setOnClickListener({
            val nome = mEditeTextNome?.text
            val sobrenome = mEditeTextSobreNome?.text
            val idade = Integer.parseInt(mEditeTextIdade?.text.toString())

            toast("Nome: $nome $sobrenome \nIdade: $idade")
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcular_activity)

        mRealm = Realm.getDefaultInstance()

        mapearComponentes()
        acoesComponentes()
        objectFromFile().execute(this)

        Log.e("tag", "awdwadaw")
    }

    override fun onDestroy() {
        super.onDestroy()
        mRealm?.close()
    }

    inner class objectFromFile : AsyncTask<Context, Void, String>() {

        override fun onPreExecute() {
            super.onPreExecute()
        }

        override fun doInBackground(vararg p0: Context?) : String? {
            var filename = "city.json"
            var brJson : String? = ""
            try {
                val manager = p0[0]?.assets

                val inputStream = manager?.open(filename)

                if (inputStream != null) {
                    val inputStreamReader = InputStreamReader(inputStream)
                    val bufferedReader = BufferedReader(inputStreamReader)
                    var stringBuilder = StringBuilder()
                    var receiveString = bufferedReader.readLine()

                    while (receiveString != null) {
                        stringBuilder.append(receiveString.trim())

                        if (receiveString.contains("\"lat\"")) {
                            var strObj = stringBuilder.toString()
                            stringBuilder = StringBuilder()

                            strObj = strObj.replace("[", "").replace("]", "").replace("}},", "").replace("{\"id", "\"id")

                            var gson = Gson()
                            try {
                                if (strObj.contains("\"BR\"")){
                                    brJson += "{$strObj}},"
                                    mListCities.add(gson.fromJson("{$strObj}}", City::class.java))
                                }
                            } catch (e: Exception){
                                Log.i(TAG, "{$strObj}}")
                                e.printStackTrace()
                            }
                        }


                        if (mListCities.size >= 3621) {
                            receiveString = null
                            brJson = "{$brJson}"
                        } else {
                            receiveString = bufferedReader.readLine()
                        }

                    }

                    inputStream.close()
                }
            } catch (e: FileNotFoundException) {
                Log.e("activity", "File not found: " + e.toString())
            } catch (e: IOException) {
                Log.e("activity", "Can not read file: " + e.toString())
            }
            return brJson
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

//            var listBr: ArrayList<City> = arrayListOf()
//            mListCities.forEach { city: City ->
//                listBr.add(city)
//            }
            if (result != null) {
                writeToFile(result)
            }

//            mRealm = Realm.getDefaultInstance()
//            mRealm?.executeTransaction { realm -> realm.copyToRealmOrUpdate(mListCities) }

//            var gson = Gson()
//            var CityBr = gson.toJson(mListCities)
        }
    }

    private fun writeToFile(data: String) {
        try {
            val extFile = File(Environment.getExternalStorageDirectory(), "/android/data/br_city.json")
            val outputStreamWriter = OutputStreamWriter(FileOutputStream(extFile))
            outputStreamWriter.write(data)
            outputStreamWriter.close()
        } catch (e: IOException) {
            Log.e("Exception", "File write failed: " + e.toString())
        }

    }

    private fun toast(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show()
    }

    private fun getWeather(key: String, latitude: Double, longitude: Double, time: Long, units: String, lang: String) {

    }

}