# Android Template

Android 앱 개발용 레포지토리 초기 설정을 할 수 있는 템플릿 프로젝트.

## 사용법

1. GitHub에서 저장소를 만들 때 `Repository template`으로 이 템플릿을 선택한다.
    - ![템플릿 사용](./doc/asset/use%20template.png)
2. 레포지토리를 로컬로 클론한다.
3. [`settings.gradle.kts`](settings.gradle.kts)에서 `rootProject.name`을 프로젝트 이름으로 변경한다.
4. [`sample-local.properties`](sample-local.properties)를 참고해서 `local.properties`를 만들거나 추가한다.
5. 각 모듈의 `android.namespace`를 프로젝트에 맞게 변경한다.
6. 테마 이름을 변경한다.
    - ![테마 이름 변경](./doc/asset/rename%20theme.png)
7. 각 모듈의 패키지를 프로젝트에 맞게 수정한다.
8. 실행 설정 수정.
    - ![실행 설정 수정](./doc/asset/run%20configuration.png)
9. [`./doc`](./doc)에서 필요없는 파일을 삭제한다.
10. `README.md`를 프로젝트에 맞게 수정한다.
