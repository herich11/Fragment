package com.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TaskListFragment extends Fragment {

    public TaskListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_task_list, container, false);

        // Initialize RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view_tasks);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Initialize Task list (This is just an example, you'd likely get this data from somewhere)
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Task 1", "Description for Task 1"));
        taskList.add(new Task("Task 2", "Description for Task 2"));
        // Add more tasks as needed

        // Initialize adapter
        TaskListAdapter taskListAdapter = new TaskListAdapter(taskList);
        recyclerView.setAdapter(taskListAdapter);

        return rootView;
    }
}
