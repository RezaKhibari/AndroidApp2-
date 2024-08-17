package com.trios2024amrk.timhortons.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trios2024amrk.timhortons.MainActivity
import com.trios2024amrk.timhortons.R
import com.trios2024amrk.timhortons.TaskList
import com.trios2024amrk.timhortons.ui.detail.ui.detail.ListDetailFragment

class ListDetailActivity : AppCompatActivity() {

    lateinit var list: TaskList


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_detail_activity)
        // 1
        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)!!
        // 2
        title = list.name

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ListDetailFragment.newInstance())
                .commitNow()
        }
    }
}