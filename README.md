# Pyramid
Pyramid 규칙
1. 이 게임에서 모앙은 중요하지 않습니다! 숫자만 생각하십시오. J = 11, Q = 12, K = 13입니다.
2. 완전히 드러난 카드 중에서 합이 13이 되도록 카드를 1장 또는 2장을 선택하여 제거합니다. K는 그 자체로 13이기 때문에 K만 눌러도 제거됩니다. 카드는 피라미드, 덱, 아카이브 어디서 선택해도 괜찮습니다.  

게임 진행
1. 화면에 피라미드 형태로 카드가 놓여있습니다. 맨 아래에 7장, 위로 올라갈수록 한 장씩 줄어들어 모두 28장의 카드가 앞면이 보이도록 놓여있습니다.
2. 그 밑에는 나머지 24장의 카드로 구성된 덱과 카드가 놓여있지 않은 아카이브 더미가 있습니다.
3. 카드를 제거할 수 있는 조합이 없다면 버튼을 눌러 아카이브로 카드 한 장을 넘깁니다.
4. 아카이브로 카드를 넘기면 되돌릴 수 없습니다! 신중하게 카드를 넘겨십시오.
5. 덱이 비었고 아카이브에 카드가 있다면 버튼을 눌러서 카드를 재활용할 수 있습니다. 재활용시 아카이브의 모든 카드들이 기존 순서를 유지한 채 덱으로 이동됩니다. 재활용은 게임당 최대 2회 가능합니다.

승리 조건
1. 게임의 승리 조건은 모든 피라미드의 카드를 지우는 것입니다. 모든 카드를 제거하고 게임이 끝나면 새게임을 할지 물어봅니다.

요구사항
1. 카드들을 보여줄 프레임을 만든다.
2. 피라미드가 될 카드 버튼들을 생성한다.
3. 피라미드를 제외한 카드들을 담아둘 덱 버튼을 생성한다.
4. 누르면 덱에 있는 카드를 아카이브로 넘길 수 있는 Change 버튼을 생성한다.
5. 덱에서 넘어간 카드를 저장할 아카이브 버튼을 생성한다.
6. 피라미드의 카드와 아카이브의 카드의 합이 13이 되면 아카이브에 있는 카드를 제거한다.
7. 제거한 아카이브 카드와 합이 13이 되는 피라미드의 카드들을 클릭할때마다 제거한다.


