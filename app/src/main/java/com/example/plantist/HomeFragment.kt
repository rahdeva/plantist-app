package com.example.plantist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.PlantsData

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var rvPlants: RecyclerView
    private var list: ArrayList<Plants> = arrayListOf()
    private lateinit var btnListView : ImageButton
    private lateinit var tvTitle: TextView
    private var i = 0

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = inflater.inflate(R.layout.fragment_home, container, false)

        // RecyclerView Inisialization
        tvTitle = rootView.findViewById(R.id.tv_title)
        rvPlants = rootView.findViewById(R.id.rv_plants)
        rvPlants.setHasFixedSize(true)


        list.addAll(PlantsData.listData)
        showRecyclerList()


        btnListView = rootView.findViewById(R.id.btn_list_view)
        btnListView.setOnClickListener(this)
        // Inflate the layout for this fragment
        return rootView
    }

    private fun showRecyclerList() {
        rvPlants.layoutManager = LinearLayoutManager(context)
        val listPlantsAdapter = ListPlantsAdapter(list)
        rvPlants.adapter = listPlantsAdapter

        listPlantsAdapter.setOnItemClickCallback(object : ListPlantsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Plants) {
                showSelectedPlants(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvPlants.layoutManager = GridLayoutManager(context, 2)
        val gridPlantsAdapter = GridPlantsAdapter(list)
        rvPlants.adapter = gridPlantsAdapter

        gridPlantsAdapter.setOnItemClickCallback(object : GridPlantsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Plants) {
                showSelectedPlants(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvPlants.layoutManager = LinearLayoutManager(context)
        val cardViewHeroAdapter = CardViewPlantsAdapter(list)
        rvPlants.adapter = cardViewHeroAdapter
    }

    private fun showSelectedPlants(plants: Plants) {
        Toast.makeText(context, "You choose " + plants.name, Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    override fun onClick(v: View?) {
        if(i < 2){
            i += 1
            menu(i)
        }
        else{
            i = 0
            menu(i)
        }
    }

    private fun menu(index: Int){
        if(index == 0){
            showRecyclerList()
            tvTitle.setText(R.string.plants_list)
            btnListView.setImageResource(R.drawable.ic_list_view)
        }
        if(index == 1){
            showRecyclerGrid()
            tvTitle.setText(R.string.plants_grid)
            btnListView.setImageResource(R.drawable.ic_grid_view)
        }
        if(index == 2){
            showRecyclerCardView()
            tvTitle.setText(R.string.plants_card)
            btnListView.setImageResource(R.drawable.ic_card_view)
        }
    }

}