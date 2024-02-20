# FinallyProject

# # # # 본인이 작성한 소스와 남이 작업한 소스 병합하기

1. 원본 소스 클론(복사) 하기 : (최초 1회만 진행)

```bash
git clone https://github.com/CEB79/hello01.git
```

2. 디렉토리 이동

```bash
cd [디렉토리 이름]
```

3. 내 고유한 저장소 만들기 : (최초 1회만 진행)

```bash
git checkout -b (본인이 원하는 저장소 이름 )
클론(복사) 받은 디렉토리에서 작업 진행해 주세요.
-> 작업 진행 이후 매번 해줘야 할 내용
```

4. 원본 소스 내려받기(남이 수정한 내역 최신화, 본인이 작업한 내용 남아있습니다.)

```bash
git pull origin main
```

5. 본인이 작업한 내용 local 저장소에 올리기

```bash
git add .
git commit -m "(커밋 내용)"
```

6. 본인 이름의 저장소에 push 하기.

```bash
git push origin (위에서 본인이 만든 저장소 이름)
```

7. git-hub 홈페이지에서 Pull requests 하기 ( '(위에서 본인이 만든 저장소 이름)' > 'main' )
