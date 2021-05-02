package app.mori.mori.cameraoriginal

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.util.*

mport android.os.Bundle;
import androidx.annotation.NonNull
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.lang.IllegalArgumentException
import java.lang.Override
import java.lang.SuppressWarnings
import java.util.HashMap

public class CameraFragmentDirections{
    private CameraFragmentDirections(){
    }

    fun actionCameraToGallery(rootDirectory: String): ActionCameraToGallery {
        return ActionCameraToGallery(rootDirectory)
    }

    fun actionCameraToPermissions(): NavDirections {
        return ActionOnlyNavDirections(R.id.action_camera_to_permissions)
    }

    class ActionCameraToGallery private constructor(rootDirectory: String) :
        NavDirections {
        private val arguments: HashMap<*, *> =
            HashMap<Any?, Any?>()

        fun setRootDirectory(rootDirectory: String): ActionCameraToGallery {
            requireNotNull(rootDirectory) { "Argument \"root_directory\" is marked as non-null but was passed a null value." }
            arguments["root_directory"] = rootDirectory
            return this
        }

        override fun getArguments(): Bundle {
            val __result = Bundle()
            if (arguments.containsKey("root_directory")) {
                val rootDirectory =
                    arguments["root_directory"] as String?
                __result.putString("root_directory", rootDirectory)
            }
            return __result
        }

        override fun getActionId(): Int {
            return R.id.action_camera_to_gallery
        }

        val rootDirectory: String
            get() = arguments["root_directory"] as String

        override fun equals(`object`: Any?): Boolean {
            if (this === `object`) {
                return true
            }
            if (`object` == null || javaClass != `object`.javaClass) {
                return false
            }
            val that = `object` as ActionCameraToGallery
            if (arguments.containsKey("root_directory") != that.arguments.containsKey("root_directory")) {
                return false
            }
            if (if (rootDirectory != null) rootDirectory != that.rootDirectory else that.rootDirectory != null) {
                return false
            }
            return if (actionId != that.actionId) {
                false
            } else true
        }

        override fun hashCode(): Int {
            var result = 1
            result =
                31 * result + if (rootDirectory != null) rootDirectory.hashCode() else 0
            result = 31 * result + actionId
            return result
        }

        override fun toString(): String {
            return ("ActionCameraToGallery(actionId=" + actionId + "){"
                    + "rootDirectory=" + rootDirectory
                    + "}")
        }

        init {
            requireNotNull(rootDirectory) { "Argument \"root_directory\" is marked as non-null but was passed a null value." }
            arguments["root_directory"] = rootDirectory
        }
    }
}