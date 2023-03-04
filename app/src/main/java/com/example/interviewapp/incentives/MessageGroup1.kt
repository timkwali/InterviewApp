package com.example.interviewapp.incentives

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.interviewapp.ui.theme.Green

@Composable
fun MessageItem1(
    message: String,
    duration: String,
    icon: ImageVector,
    tint: Color,
    modifier: Modifier = Modifier
) {
    Surface() {
        Row() {
            Icon(imageVector = icon, contentDescription = "")
            Text(text = message)
            Text(text = duration)
        }
    }
}

@Preview
@Composable
fun MessageItem1Preview() {
    MessageItem1(
        "Trips Completed",
        "20 Trips",
        icon = Icons.Outlined.CheckCircle,
        tint = Green,
        modifier = Modifier
    )
}