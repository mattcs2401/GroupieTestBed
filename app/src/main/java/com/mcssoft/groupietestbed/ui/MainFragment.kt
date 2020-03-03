package com.mcssoft.groupietestbed.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mcssoft.groupietestbed.MainViewModel
import com.mcssoft.groupietestbed.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel = MainViewModel()
        // TODO: Use the ViewModel

        val groupAdapter = GroupAdapter<GroupieViewHolder>()

        id_recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = groupAdapter
        }
    }

}
