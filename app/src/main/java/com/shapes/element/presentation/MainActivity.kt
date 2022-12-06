package com.shapes.element.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.shapes.element.presentation.main.component.ApplicationComponent
import com.shapes.element.ui.theme.ElementTheme

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ElementTheme {
				val size = calculateWindowSizeClass(this)
				ApplicationComponent(size)
			}
		}
	}
}
