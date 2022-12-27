package com.example.beyondschool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beyondschool.databinding.FragmentSpellingBinding

class Spelling : Fragment() {

    private lateinit var binding: FragmentSpellingBinding
    private lateinit var adapter: GradeAdapter
    private  var list= arrayListOf<DataGrades>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSpellingBinding.inflate(layoutInflater)

        list.add(DataGrades("Grades 1","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 2","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 3","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 4","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 5","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 6","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 7","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 8","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 9","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 10","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 11","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 12","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 13","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 14","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 15","","Level 1","man,may,this"))
        list.add(DataGrades("Grades 16","","Level 1","man,may,this"))

        adapter = GradeAdapter(requireContext(),list)
        binding.rcSpelling.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.rcSpelling.adapter=adapter

        return binding.root
    }

}