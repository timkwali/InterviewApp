package com.example.interviewapp.incentives

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interviewapp.R
import com.example.interviewapp.ui.theme.Red

@Composable
fun WarningBar(
    text: String,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(8.dp))
        .background(Red.copy(alpha = 0.1f))
    ) {
        Icon(
            Icons.Outlined.Info,
            tint = Red,
            contentDescription = "Warning Icon"
        )
        Text(
            text = text,
            color = Red,
            modifier = Modifier
                .padding(start = 11.dp)
        )
    }
}

@Composable
@Preview
fun WarningBarPreview() {
    WarningBar(text = stringResource(id = R.string.waning_string))
}









