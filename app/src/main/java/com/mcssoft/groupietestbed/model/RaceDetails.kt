package com.mcssoft.groupietestbed.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "race_details")
data class RaceDetails(@ColumnInfo(name = "CityCode") var cityCode: String,
                       @ColumnInfo(name = "RaceCode") var raceCode: String,
                       @ColumnInfo(name = "RaceNum")  var raceNum: String,
                       @ColumnInfo(name = "RaceSel")  var raceSel: String,
                       @ColumnInfo(name = "RaceTimeS") var raceTimeS: String) : Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    var id: Long? = null    // value inserted by Room.

    // Non-mandatory or default values.
    @ColumnInfo(name = "RaceDate")
    var raceDate: String = "01/01/1970"    // raceDetails date.
    @ColumnInfo(name = "RaceTimeL")
    var raceTimeL: Long = 0               // raceDetails time as Long val.
    @ColumnInfo(name = "RaceSel2")
    var raceSel2: String = ""              // 2nd raceDetails sel (multi sel).
    @ColumnInfo(name = "RaceSel3")
    var raceSel3: String = ""              // 3rd "    "    "
    @ColumnInfo(name = "RaceSel4")
    var raceSel4: String = ""              // 4th "    "    "

    /**
     * Get the qualified meeting identifier.
     * @return The meeting identifier, e.g. "BR".
     */
    fun meetingCode(): String = """$cityCode$raceCode"""

    /**
     * Get the qualified meeting identifier and raceDetails number.
     * @return The meeting identifier, e.g. "BR1".
     */
    fun meetingCodeNum(): String = """$cityCode$raceCode$raceNum"""

    //<editor-fold default state="collapsed" desc="Region: Serializable">
    override fun toString(): String {
        return "cityCode=$cityCode, raceCode=$raceCode, raceNum=$raceNum," +
                " raceSel=$raceSel, raceTimeS=$raceTimeS, id=$id, raceDate=$raceDate," +
                " raceTimeL=$raceTimeL, raceSel2=$raceSel2, raceSel3=$raceSel3," +
                " raceSel4=$raceSel4"
    }
    //</editor-fold>

}