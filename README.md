# 👋🧩 xvoid-nullptr Morphe Patches

Custom Morphe patches for Android apps.

## ❓ About

My own collection of Morphe patches for Android apps. Currently includes:

- **Remove "Connected to Tor" Toast** — removes the "Connected to Tor" toast notification.

### How to use these patches

Click the button below, or manually add this repo url to Morphe Manager: https://github.com/xvoid-nullptr/morphe-patches

<a href="https://morphe.software/add-source?github=xvoid-nullptr/morphe-patches">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->

<!-- Do not modify this section by hand. The patch list is generated when release.yml creates a new release.
     
     If you wish for the patches list to be collapsed, then remove the word 'EXPANDED' from the comment tag above.

     If you wish to manually keep this list updated then remove the PATCHES_START and PATCHES_END 
     comment blocks entirely. -->

#### A list of your patches will automatically be shown here after your first patches release is created.

&nbsp;

## 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

xvoid-nullptr Morphe Patches are licensed under the [GNU General Public License v3.0](LICENSE)