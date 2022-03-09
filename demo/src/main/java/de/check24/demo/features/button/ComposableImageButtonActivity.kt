package de.check24.demo.features.button

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.check24.demo.R
import de.check24.demo.ui.theme.DemoTheme

class ComposableImageButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DemoTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "ImageButton")
                            })
                    }, content = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            ImageButton()
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun ImageButton() {
    Button(
        onClick = {},
        modifier = Modifier.size(80.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White
        ),
        elevation = ButtonDefaults.elevation(0.dp, 0.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.c24logo),
            contentDescription = "Image of Button",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
private fun ImageButtonPreview() {
    DemoTheme {
        ImageButton()
    }
}