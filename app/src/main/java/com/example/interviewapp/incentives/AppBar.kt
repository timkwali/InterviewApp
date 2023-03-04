package com.example.interviewapp.incentives

import androidx.compose.foundation.background
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppBar(text: String, modifier: Modifier = Modifier) {
    TopAppBar(
        navigationIcon = {Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back Arrow")},
        title = { Text(text = text, color = Color.Black)},
        modifier = modifier.background(Color.White),
        backgroundColor = Color.White
    )
}

@Preview
@Composable
fun AppBarPreview() {
    AppBar(text = "Incentives")
}