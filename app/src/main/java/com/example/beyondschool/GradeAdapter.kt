package com.example.beyondschool

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beyondschool.databinding.ItemLayoutBinding

class GradeAdapter(var context: Context, private val list : ArrayList<DataGrades>): RecyclerView.Adapter<GradeAdapter.GradeViewHolder>() {
    class GradeViewHolder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind (grades: DataGrades){
            binding.tvGrades.text=grades.textView
            binding.tvLevels.text = grades.textView
            binding.tvLevels.text = grades.textView
            binding.expandableLayout
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GradeViewHolder {
        val binding = ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return GradeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GradeViewHolder, position: Int) {

        val dataGrades = list[position]
        holder.bind(dataGrades)

        val isExpandable : Boolean = dataGrades.isExpandable



    }

    override fun getItemCount(): Int {
        return list.size
    }
}