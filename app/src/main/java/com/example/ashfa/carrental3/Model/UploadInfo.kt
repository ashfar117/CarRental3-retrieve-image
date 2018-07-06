package com.example.ashfa.carrental3.Model

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ashfa.carrental3.R
import com.google.firebase.database.IgnoreExtraProperties



        @IgnoreExtraProperties
        class UploadInfo {

            var name: String = ""
            var url: String = ""

            constructor() {}

            constructor(name: String, url: String) {
                this.name = name
                this.url = url
            }
        }
