package com.example.mgithubexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mgithubexample.ui.theme.MGitHubExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MGitHubExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Column(modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Greeting("Satwinder")
                        var list = listOf<String>("jatin","satwinder","Raman","Sahil","Hrmam","Abhishek")
                        MyLazyClm(list)
                        var painter = painterResource(id = R.drawable.foodimg)
                        imageImpl(painter)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", textAlign = TextAlign.Center)
}
@Composable
fun imageImpl(name: Painter) {
//    Text(text = "Hello $name!", textAlign = TextAlign.Center)
    Image(painter = name, contentDescription = null, modifier = Modifier.size(100.dp))
}

@Composable
fun MyLazyClm(items: List<String>) {
    LazyColumn(modifier = Modifier.fillMaxWidth(),  verticalArrangement = Arrangement.Center, contentPadding = PaddingValues(10.dp))
    {
        items(items){
            item ->  
            Text(text = item, fontSize = 18.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MGitHubExampleTheme {
        Greeting("Android")
    }
}