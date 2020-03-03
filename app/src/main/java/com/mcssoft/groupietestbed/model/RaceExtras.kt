package com.mcssoft.groupietestbed.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

/**
 * Class to model the extras captured from a http://tatts.com page.
 * @param meetingCode: The meeting code associated with the race, e.g. 'BR1'.
 * @Notes:
 * (1) The meeting code is a concatenation of the xml attributes MeetingCode and RaceNo values.
 * (2) For a given meeting code, the only difference in the records will be the Runner info.
 */
@Entity(tableName = "race_extras")
class RaceExtras(@ColumnInfo(name = "MeetingCode") var meetingCode: String) : Serializable {
    // TODO - This database design is for simplicity until the RaceExtras are implemented fully in
    //        the MainFragment recyclerview, then re-assess especially WRT the backing data.
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id") var id: Long? = null    // value inserted by Room.

    // Meeting.
//    @ColumnInfo(name = "MeetingCode") var meetingCode: String = ""
    @ColumnInfo(name = "VenueName") var venueName: String = ""
    @ColumnInfo(name = "TrackDesc") var trackDesc: String = ""
    @ColumnInfo(name = "WeatherDesc") var weatherDesc: String = ""
    @ColumnInfo(name = "TrackRating") var trackRating: String = ""

    // Race.
    @ColumnInfo(name = "RaceNo") var raceNo: String = ""
    @ColumnInfo(name = "RaceName") var raceName: String = ""
    @ColumnInfo(name = "Distance") var distance: String = ""

    // Runner.
    @ColumnInfo(name = "RunnerNo") var runnerNo: String = ""
    @ColumnInfo(name = "RunnerName") var runnerName: String = ""
    @ColumnInfo(name = "Rider") var rider: String? = ""
    @ColumnInfo(name = "Weight") var weight: String = ""
    @ColumnInfo(name = "LastResult") var lastResult: String? = ""
    @ColumnInfo(name = "Rtng") var rtng: String = ""

    // File.
    @ColumnInfo(name = "FileId") var fileId: Long = 0

    //<editor-fold default state="collapsed" desc="Region: Serializable">
    override fun toString(): String {
        return "$meetingCode,$venueName,$trackDesc,$weatherDesc,$trackRating,$raceNo,$raceName," +
                "$distance,$runnerNo,$runnerName,$rider,$weight,$lastResult,$rtng,$fileId"
    }
    //</editor-fold>

}