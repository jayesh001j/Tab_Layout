package layout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tab_layout.Fragment.CallFragment
import com.example.tab_layout.Fragment.ChatFragment
import com.example.tab_layout.Fragment.StatusFragment

class viewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position)// Switchcase

        {
            0 -> ChatFragment()
            1 -> StatusFragment()
            2 -> CallFragment()
            else -> ChatFragment()

        }

    }
}